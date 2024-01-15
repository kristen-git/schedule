import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  16:44
 * @Description: TODO
 */

public class UserSystem {
    public static void main(String[] args) {
        ShowUserItems showUserItems = new ShowUserItems();
        ArrayList<User> usersItems = showUserItems.showUserManager();
        UserManager userManager = new UserManager();
        userManager.users=usersItems;
        do {
            System.out.println("欢迎来到用户管理系统！");
            System.out.println("【1】用户列表");
            System.out.println("【2】用户注册");
            System.out.println("【3】用户登录");
            System.out.println("【4】删除用户");
            System.out.println("请输入你的操作选项：");
            Scanner scanner = new Scanner(System.in);
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        userManager.printUser();
                        break;
                    case 2:
                        System.out.println("请输入您注册的用户名及密码");
                        String registerUserName = scanner.next();
                        String registerPassword = scanner.next();
                        userManager.register(registerUserName, registerPassword);
                        break;
                    case 3:
                        System.out.println("请输入您的用户名及密码");
                        String loginUserName = scanner.next();
                        String loginPassword = scanner.next();
                        userManager.login(loginUserName, loginPassword);
                        break;
                    case 4:
                        System.out.println("请输入要删除的用户ID：");
                        int ID = scanner.nextInt();
                        userManager.delete(ID);
                        break;
                    default:
                        System.out.println("您的输入有误，请重新输入：");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("输入异常");
            }
        } while (true);
    }
}
