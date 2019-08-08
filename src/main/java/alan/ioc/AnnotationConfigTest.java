package alan.ioc;
import static java.lang.System.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigTest {
    public static void main(String args[]){
        out.println("hello");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

        Modern cd = context.getBean(Modern.class);
        CDPlayer player=context.getBean(CDPlayer.class);
        System.out.println(cd.getClass().getName());
        cd.info();
        player.play();
        new Modern().info();

        context.close();
    }
}
