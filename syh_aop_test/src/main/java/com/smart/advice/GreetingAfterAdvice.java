package com.smart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GreetingAfterAdvice implements AfterReturningAdvice {

    /**在目标类方法调用后执行
     * 
     *@param returnObj:目标实例方法返回的结果
     *@param method ：目标类方法
     *@pram args ：目标实例的方法入参
     *@pram obj： 目标类实例
     */
    public void afterReturning(Object returnObj, Method method, Object[] args,
                               Object obj) throws Throwable {
        
        String clientName = (String) args[0];
        System.out.println("Please enjoy yourself!"+clientName);
    }
}
