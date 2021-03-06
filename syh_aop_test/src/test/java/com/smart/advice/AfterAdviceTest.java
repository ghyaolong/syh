package com.smart.advice;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.framework.ProxyFactory;
public class AfterAdviceTest {

    private Waiter target;
    private AfterAdvice advice;
    private ProxyFactory pf;

    @Before
    public void init() {
        target = new NaiveWaiter();
        advice = new GreetingAfterAdvice();
        //①Spring提供的代理工厂
        pf = new ProxyFactory();
        // ②设置代理目标
        pf.setTarget(target);
        //③为代理目标添加增强
        pf.addAdvice(advice);
    }

    @Test
    public void beforeAdvice() {
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
