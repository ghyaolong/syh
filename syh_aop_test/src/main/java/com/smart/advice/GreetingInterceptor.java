package com.smart.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *环绕增强<br>
 *
 * Company: 善友汇网络科技股份有限公司
 * <p>
 * @author 姚成龙
 * @version 1.0.0
 */
public class GreetingInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName = (String) args[0];
        
        System.out.println("How are you！Mr." + clientName + ".");

        Object obj = invocation.proceed();

        System.out.println("Please enjoy yourself!");

        return obj;
    }
}
