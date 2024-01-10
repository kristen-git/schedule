import java.util.*;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  17:53
 * @Description: TODO
 */

public class LotteryTest {
    public static void main(String[] args) {
        // 生成红色球号码（1-33）
        List<Integer> redNumbers = generateRedNumber();

        // 生成蓝色球号码（1-16）
        int blueNumber = generateBlueNumber();

        System.out.print("红色球号码：");
        for (int number : redNumbers) {
            System.out.print(number + ",");
        }
        System.out.println("\n蓝色球号码：" + blueNumber);
    }

    private static List<Integer> generateRedNumber() {
        Random random = new Random();
        Set<Integer> numbersSet = new HashSet<>();

        while (numbersSet.size() < 7) {
            int number = random.nextInt(34) + 1;

            if (!numbersSet.contains(number)) {
                numbersSet.add(number);
            }
        }
        //创建TreeSet排序的lambda表达式; 相比于传统方式,代码量上有了很大的减少;
        TreeSet<Integer> set = new TreeSet<>(((o1, o2) -> o1.compareTo(o2)));
        set.addAll(numbersSet);

        return new ArrayList<>(set);
    }

    private static int generateBlueNumber() {
        Random random = new Random();
        return random.nextInt(17) + 1;

    }
}
