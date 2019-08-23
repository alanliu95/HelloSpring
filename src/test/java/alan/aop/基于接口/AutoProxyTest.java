package alan.aop.基于接口;

import alan.aop.NaiveWaiter;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//指定用哪个配置启动spring ioc 容器
@ContextConfiguration(locations = {"classpath:autoProxy-beans.xml"})
public class AutoProxyTest {
//    @Autowired
//    Waiter waiter;
//    @Test
//    public void test(){
//        waiter.greetTo("Alan");
//        waiter.serveTo("Alan");
//    }

    @Autowired
    NaiveWaiter naiveWaiter;

//    @Autowired
//    ApplicationContext atx;
    @Test
    public void advisorTest(){
        //NaiveWaiter naiveWaiter=(NaiveWaiter) atx.getBean("target");
        naiveWaiter.greetTo("alan");
        naiveWaiter.serveTo("alan");
    }
}
