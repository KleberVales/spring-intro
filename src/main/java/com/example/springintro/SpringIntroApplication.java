package com.example.springintro;

import com.example.springintro.appconfig.AppConfig;
import com.example.springintro.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIntroApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}

/* Write a message in console */