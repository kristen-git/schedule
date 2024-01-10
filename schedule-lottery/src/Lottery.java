import java.util.*;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  17:50
 * @Description: 双色球彩票开奖规则
 */

public class Lottery {
    public static void main(String[] args) {
        //生成红色球（1-33） 5个不能重复
        TreeSet<Integer> integers = generateRedBall();
        System.out.print("本期中奖号码为：");
        for (int number : integers) {
            System.out.print(number + ",");
        }
        //生成蓝色球（1-16） 1个
        System.out.print("特别号码为：" + generateBullBall());

    }

    public static TreeSet<Integer> generateRedBall() {
        Random random = new Random();
        TreeSet<Integer> integers = new TreeSet<>();
        while (integers.size() < 5) {
            integers.add(random.nextInt(33) + 1);
        }
        return integers;
    }

    public static int generateBullBall() {
        Random random = new Random();
        int bullBall = random.nextInt(16) + 1;
        return bullBall;
    }
}
