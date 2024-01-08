import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  14:30
 * @Description: TODO
 */

public class Test2 {
    public static void main(String[] args) {
        //先通过三个随机数对应得到 NPC出的什么
        Random random = new Random();
        int i = random.nextInt(3);
        String NPC = "";
//        if (i == 0) {
//            NPC = "石头";
//        } else if (i == 1) {
//            NPC = "剪刀";
//        } else if (i == 2) {
//            NPC = "布";
//        }

        switch(i){
            case 0:
                NPC = "石头";
                break;
            case 1:
                NPC = "剪刀";
                break;
            case 2:
                NPC = "布";
                break;
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
        } else if (NPC.equals("布") && player.equals("剪刀")) {
            System.out.println("玩家 赢");
        } else if (NPC.equals("布") && player.equals("石头")) {
            System.out.println("NPC 赢");
        } else if (NPC.equals("石头") && player.equals("布")) {
            System.out.println("玩家 赢");
        } else if (NPC.equals("石头") && player.equals("剪刀")) {
            System.out.println("NPC 赢");
        } else if (NPC.equals("剪刀") && player.equals("石头")) {
            System.out.println("玩家 赢");
        } else if (NPC.equals("剪刀") && player.equals("布")) {
            System.out.println("NPC 赢");

        }

    }
}
