package alan.aop;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;


/**
 * 为了在函数不同位置织入增强，需要使用不同 Spring Advice类
 * 当实现了一个具体的Advice，我们也确定了位置信息和具体增强代码
 * 切面类 依赖增强类，指定哪些方法需要被增强
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        System.out.println(obj.getClass().getName()+"."+method.getName());
        String clientName = (String)args[0];
        System.out.println("How are you！Mr."+clientName+".");
    }
}
