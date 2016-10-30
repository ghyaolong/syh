package com.smart.advice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAdviceTest {

    @Test
    public void testAdvice() {
        String configPath = "com/smart/advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
    }
}
