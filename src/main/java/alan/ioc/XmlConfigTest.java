package alan.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-beans.xml");
        Modern app = context.getBean(Modern.class);

        app.info();

        // close the context
        context.close();
    }
}
