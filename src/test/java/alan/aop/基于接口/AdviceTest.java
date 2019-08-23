package alan.aop.基于接口;

import alan.aop.NaiveWaiter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 基于ProxyFactoryBean手工生成代理类
 * 为ProxyFactoryBean指定具体增强类，可以生成代理接口（或类）
 * 为ProxyFactoryBean指定具体切面，可以生成代理接口（或类）
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:advisor-beans.xml"})
public class AdviceTest {
    //使用jdk 动态代理
//    @Autowired
//    Waiter waiter;
//    @Test
//    public void test(){
//        waiter.greetTo("Alan");
//        waiter.serveTo("Alan");
//    }

    @Autowired
    @Qualifier("NaiveWaiter")
    NaiveWaiter naiveWaiter;
    @Test
    public void advisorTest(){
        naiveWaiter.greetTo("alan");
        naiveWaiter.serveTo("alan");
    }
}
