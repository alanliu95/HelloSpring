package alan.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 *在ioc中装配该bean时需要指定某一增强类
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class clazz){
        return "greetTo".equals(method.getName());
    }
}
