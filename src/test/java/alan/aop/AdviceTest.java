package alan.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//指定用哪个配置启动spring ioc 容器
@ContextConfiguration(locations = {"classpath:advisor-beans.xml"})
public class AdviceTest {
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
