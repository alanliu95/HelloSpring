package alan.aop;

import org.springframework.aop.MethodBeforeAdvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        System.out.println(obj.getClass().getName()+"."+method.getName());
        String clientName = (String)args[0];
        System.out.println("How are you！Mr."+clientName+".");
    }
}
