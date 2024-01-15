import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  09:52
 * @Description: TODO
 */

public class DVDTest {
    public static void main(String[] args) {
        ShowDVD showDVD = new ShowDVD();
        ArrayList<DVD> dvds = showDVD.showDVDManager();
        DVDManager dvdManager = new DVDManager();
        dvdManager.dvds=dvds;
        do {
            System.out.println("欢迎来到极客DVD商城");

            System.out.println("【1】DVD商品列表");
            System.out.println("【2】想借一张DVD");
            System.out.println("【3】想还一张DVD");
            System.out.println("请选择您的操作：");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dvdManager.printDVD();
                    continue;
                case 2:
                    System.out.println("请输入您要借的DVD名称：");
                    String DVDLendName = scanner.next();
                    dvdManager.lend(DVDLendName);
                    continue;
                case 3:
                    System.out.println("请输入您要归还的DVD名称");
                    String DVDBackName = scanner.next();
                    dvdManager.back(DVDBackName);
            }
        } while (true);
    }
}
