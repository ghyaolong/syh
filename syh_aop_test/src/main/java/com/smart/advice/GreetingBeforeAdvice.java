package com.smart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
	
    /**
     *@param mthod:目标类方法
     *@param args:目标类方法的入参
     *@param obj:目标类实例
     */
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        String clientName = (String) args[0];
        System.out.println("How are you！Mr." + clientName + ".");
    }
}
