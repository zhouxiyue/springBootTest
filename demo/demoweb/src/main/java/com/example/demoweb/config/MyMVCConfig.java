package com.example.demoweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//如果想diy一些定制化的功能，只要写这个组件，然后将它交给springboot
//springboot就会帮我们自动装配
@Configuration
@EnableWebMvc //导入了DelegatingWebMvcConfiguration类，此类继承了WebMvcConfigurationSupport
// 从容器中获取所有的webmvcConfig，webMvcAutoConfiguration中有条件的加载类，
// 条件为没有这类WebMvcConfigurationSupport时，因此次注解添加后，webMvcAutoConfiguration将会失效
public class MyMVCConfig implements WebMvcConfigurer {
//    @Bean
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//    }
//
//    //自定义示图解析器
//    public static class MyViewResolver implements ViewResolver{
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }

    //视图跳转
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/viewController").setViewName("test");
//    } @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/viewController").setViewName("test");
////    }
}
