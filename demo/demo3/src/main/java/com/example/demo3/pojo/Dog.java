package com.example.demo3.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@Getter
@Setter
public class Dog {
    @Value("gogo")
    private String name;
    @Value("3")
    private Integer age;
}
