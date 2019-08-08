package alan.spring.jdbc;

public class User {
    private int id;
    private String name;
    private String pw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(){}

    public User(String name, String pw) {
        this.name = name;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}

