package com.example.demo;

import com.fasterxml.jackson.databind.introspect.Annotated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    public void spinrgBean(){
        // 通过spring.xml配置文件加载spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.getBean("");

        // 通过spring注解的形式加载spring容器
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(DemoApplication.class);
        context1.getBean("");


    }

}
