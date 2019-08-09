package alan.orm.hibernate;

import alan.orm.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * 基于Spring JDBC的DAO，实现对表 users 的 增删改查
 */
@Repository
public class UserDao {
    private static final Logger logger= LoggerFactory.getLogger(UserDao.class);
    @Autowired
    private HibernateTemplate hibernateTemplate;

    //检索记录,根据id
    public User selectOnebyId(int user_id){
        logger.debug("查询记录");
        return hibernateTemplate.get(User.class,user_id);

    }

//    private static final String update="update users set user_pw=? where user_id=?";
//    public void update(User user){
//        Object[] params=new Object[]{user.getPw(),user.getId()};
//        jdbcTemplate.update(update,params,new int[]{Types.VARCHAR,Types.INTEGER});
//    }
}
