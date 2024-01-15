import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  16:44
 * @Description: TODO
 */

public class UserManager {
    //    注册用户：用户输入用户名和密码进行注册，如果用户名已存在，提示用户无法注册，否则注册成功。
//    用户登录：用户输入用户名和密码，如果用户名密码正确，则提示登录成功。
//    查看用户：展示所有的用户数据，包括用户名、注册时间。
//    删除用户：将用户删除。
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    ArrayList<User> users = new ArrayList<>();

    /*用户注册*/
    public void register(String userName, String password) {
        int i = 0;
        while (true) {
            if (userName.equals(users.get(i).getUserName())) {
                System.out.println("用户已经存在，无法注册");
                break;
            } else {
                i++;
                if (i == users.size()) {
                    User user = new User(i + 1, userName, password, new Date(),false);
                    users.add(user);
                    System.out.println("用户ID为："+user.getUserId() + " 用户名为：" + user.getUserName() + " 在 " +
                            sdf.format(user.getRegisterTime()) + " " + "注册完成!");
                    break;
                }
            }
        }
    }

    /*用户登录*/
    public void login(String userName, String password) {
        int i = 0;
        while (true){
            if(userName.equals(users.get(i).getUserName())&& password.equals(users.get(i).getPassword())){
                users.get(i).setLoginState(true);
                System.out.println("登陆成功");
                break;
            }else if(userName.equals(users.get(i).getUserName())&& !password.equals(users.get(i).getPassword())){
                System.out.println("密码错误！请重新登录！");
                break;
            }else{
                i++;
                if (i == users.size()) {
                    System.out.println("此用户不存在，请重新注册！");
                    break;
                }
            }
        }
    }

    /*用户查看*/
    public void printUser() {
        System.out.println("用户ID    用户名     用户注册时间");
        for (User user : users) {
            System.out.println("  " + user.getUserId() + "      " + user.getUserName() + "     "
                    + sdf.format(user.getRegisterTime()));
        }
    }

    /*删除用户*/
    public void delete(int userId) {
        users.remove(userId-1);
        for (int i = 0; i < users.size(); i++) {
            users.get(i).setUserId(i+1);
        }
    }
}
