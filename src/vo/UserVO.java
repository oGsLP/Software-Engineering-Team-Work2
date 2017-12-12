package vo;

public class UserVO {
    /**
     * 用户id
     */
    private int id;

    /**
     * 用户职位
     */
    private String type;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    public UserVO() {
    }

    public UserVO(int id, String type, String name, String password) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
