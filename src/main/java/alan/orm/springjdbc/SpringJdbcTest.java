package alan.orm.springjdbc;

import alan.orm.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建spring ioc容器，使用springjdbc 查询记录
 */
public class SpringJdbcTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springjdbc-beans.xml");
        UserDao userDao = context.getBean(UserDao.class);
        User user=userDao.selectOnebyId(1);
        System.out.println(user);
        // close the context
        context.close();
    }

}
