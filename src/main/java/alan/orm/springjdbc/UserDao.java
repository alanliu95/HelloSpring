package alan.orm.springjdbc;

import alan.orm.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
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
    private JdbcTemplate jdbcTemplate;

    private static final String createTab="create table users(\n" +
            "  user_id   int           not null auto_increment,\n" +
            "  user_name VARCHAR(30)   not null  ,\n" +
            "  user_pw   VARCHAR(30)   not null  ,\n" +
            "  PRIMARY KEY (user_id)\n" +
            ")ENGINE=InnoDB;";
    public void createTab(){
        jdbcTemplate.execute(createTab);
    }
    //增加一条记录
    private static final String insertOne="insert into users(user_name,user_pw) values(?,?)";
    public void insertOne(User user){
        Object[] params=new Object[]{user.getName(),user.getPw()};
        jdbcTemplate.update(insertOne,params,new int[]{Types.VARCHAR,Types.VARCHAR});
    }
    //检索记录,根据id
    private static final String selectOnebyId="select * from users where user_id=?";
    public User selectOnebyId(int user_id){
        logger.debug("查询记录");
        User user=new User();
        jdbcTemplate.query(selectOnebyId, new Object[]{user_id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setId(user_id);
                user.setName(rs.getString("user_name"));
                user.setPw(rs.getString("user_pw"));
            }
        });
        return user;
    }

    private static final String update="update users set user_pw=? where user_id=?";
    public void update(User user){
        Object[] params=new Object[]{user.getPw(),user.getId()};
        jdbcTemplate.update(update,params,new int[]{Types.VARCHAR,Types.INTEGER});
    }
}
