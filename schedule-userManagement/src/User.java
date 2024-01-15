import java.util.Date;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  16:44
 * @Description: TODO
 */

public class User {
    private int userId;
    private String UserName;
    private String password;
    private Date registerTime;
    private boolean loginState;

    public User() {
    }

    public User(int userId, String userName, String password, Date registerTime, boolean loginState) {
        this.userId = userId;
        UserName = userName;
        this.password = password;
        this.registerTime = registerTime;
        this.loginState = loginState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public boolean isLoginState() {
        return loginState;
    }

    public void setLoginState(boolean loginState) {
        this.loginState = loginState;
    }
}
