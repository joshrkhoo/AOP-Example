package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class ExampleAspect {

    // This is the advice that will be executed before the method execution
    @Before("execution(* com.example.demo.service.DemoService.*(..))")
    public void before() {
        System.out.println("This message prints before the method execution.");
    }

}
