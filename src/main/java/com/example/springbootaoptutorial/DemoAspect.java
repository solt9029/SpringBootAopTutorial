package com.example.springbootaoptutorial;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAspect {
    @Before("within(com.example.springbootaoptutorial.DemoService)")
    public void beforeHandler() {
        System.out.println("before DemoService method");
    }
}
