import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  14:00
 * @Description: TODO
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------欢迎来到极客游戏平台------");
        System.out.println("------健康游戏  健康生活------");
        System.out.println("------即将开始人机猜拳游戏------");
        System.out.println("请输入玩家的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入玩家的住址：");
        String address = scanner.nextLine();
        System.out.println("请输入玩家的年龄：");
        int age = scanner.nextInt();
        System.out.println("您输入的玩家姓名为 "+name+"地址为 "+address+"年龄为 "+age);

    }
}
