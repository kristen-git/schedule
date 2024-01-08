import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  14:58
 * @Description: 实现玩家与NPC循环猜拳并计数的游戏
 */

public class Test3 {
    public static void main(String[] args) {
        String isContinue="";
        int equalCount=0;
        int playerWinCount=0;
        int NPVWinCount=0;
        do {
            //先通过三个随机数对应得到 NPC出的什么
            Random random = new Random();
            int i = random.nextInt(3);
            String NPC = "";
            if (i == 0) {
                NPC = "石头";
            } else if (i == 1) {
                NPC = "剪刀";
            } else if (i == 2) {
                NPC = "布";
            }
            //再得到玩家出的什么
            Scanner scanner = new Scanner(System.in);
            System.out.println("玩家请出拳");
            String player = scanner.nextLine();
            System.out.println("玩家出拳为 " + player);

            System.out.println("NPC出拳为 " + NPC);

            //两者进行比较
            if (NPC.equals(player)) {
                System.out.println("平局");
                equalCount++;
            } else if (NPC.equals("布") && player.equals("剪刀")) {
                System.out.println("玩家 赢");
                playerWinCount++;
            } else if (NPC.equals("布") && player.equals("石头")) {
                System.out.println("NPC 赢");
                NPVWinCount++;
            } else if (NPC.equals("石头") && player.equals("布")) {
                System.out.println("玩家 赢");
                playerWinCount++;
            } else if (NPC.equals("石头") && player.equals("剪刀")) {
                System.out.println("NPC 赢");
                NPVWinCount++;
            } else if (NPC.equals("剪刀") && player.equals("石头")) {
                System.out.println("玩家 赢");
                playerWinCount++;
            } else if (NPC.equals("剪刀") && player.equals("布")) {
                System.out.println("NPC 赢");
                NPVWinCount++;
            }

            System.out.println("是否继续:y/n");
            isContinue= scanner.nextLine();
        }
        //进入循环游戏中
        while(isContinue.equals("y"));

        System.out.println("游戏结束");
        System.out.println("平局次数为：" + equalCount);
        System.out.println("玩家赢的次数为：" + playerWinCount);
        System.out.println("NPC赢的次数为：" + NPVWinCount);
        //计数

    }
}
