package com.example.demo3.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Data
@Getter
@Setter
@ConfigurationProperties(prefix = "person")
@Validated//数据校验

//加载指定的配置文件
//@PropertySource(value = "classpath:test.properties")
public class person {
//    @Value("${name}")
    @Email
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
