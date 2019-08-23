package alan.aop.基于AspectJ注解;

import alan.aop.NaiveWaiter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//指定用哪个配置启动spring ioc 容器
@ContextConfiguration(locations = {"classpath:aspectJ-based-beans.xml"})
public class AspectJAnnoTest {

    @Autowired
    NaiveWaiter naiveWaiter;

    @Test
    public void Test() {
        naiveWaiter.greetTo("alan");
        naiveWaiter.serveTo("alan");
    }
}
