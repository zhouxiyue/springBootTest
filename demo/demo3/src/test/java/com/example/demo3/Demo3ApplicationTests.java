package com.example.demo3;

import com.example.demo3.pojo.Dog;
import com.example.demo3.pojo.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {

    @Autowired
    private Dog dog;
    @Autowired
    private person person;

    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
    }

}
