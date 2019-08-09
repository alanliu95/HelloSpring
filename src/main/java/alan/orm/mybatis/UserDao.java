package alan.orm.mybatis;


import alan.orm.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public void insertOne(User user);

    //检索记录,根据id
    public User selectOnebyId(int user_id);

    public void update(User user);
}
