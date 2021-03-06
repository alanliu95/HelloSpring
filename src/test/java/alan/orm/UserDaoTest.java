package alan.orm;

import alan.orm.User;
import alan.orm.springjdbc.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//使Juint 创建spring 环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定用哪个配置启动spring ioc 容器
@ContextConfiguration(locations = {"classpath:springjdbc-beans.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void addUser(){
        User user=new User("alan","alan");
        userDao.insertOne(user);
        //userDao.createTab();
        System.out.println("test finished");
    }
    @Test
    public void getUser(){
        User user=userDao.selectOnebyId(1);
        System.out.println(user);
    }

    @Test
    public void updateUser(){
        User user=new User("alan","new");
        user.setId(1);
        userDao.update(user);
        System.out.println(userDao.selectOnebyId(1));
    }
}
