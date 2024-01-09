import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  20:46
 * @Description: 实现加减乘除计算器的功能
 */

public class Calculator {
    public static void main(String[] args) {
        String isContinue = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入运算符 + - * /");
            String option = scanner.nextLine();
            if (option.equals("+") || option.equals("-") || option.equals("*") || option.equals("/")) {
                System.out.println("运算符输入正确，请输入多个操作数：");
            } else {
                System.out.println("运算符输入错误,请重新运行");
                break;
            }
            String s = scanner.nextLine();
            List<String> listString = Arrays.asList(s.split("\\s+"));
            List<Double> list = new ArrayList<Double>();
            for (int i = 0; i < listString.size(); i++) {
                double d = Double.parseDouble(listString.get(i));
                list.add(d);
            }

            switch (option) {
                case "+":
                    System.out.println(add(list));
                    break;
                case "-":
                    System.out.println(subtract(list));
                    break;
                case "*":
                    System.out.println(multiply(list));
                    break;
                case "/":
                    System.out.println(divide(list));
                    break;
            }
            System.out.println("是否继续:y/n");
            isContinue = scanner.nextLine();
        }
        //进入循环游戏中
        while (isContinue.equals("y"));
    }


    public static double add(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static double subtract(List<Double> list) {
        //被减数为list的第一个数
        double minus = list.get(0);
        double subResult = 0;
        for (int i = 1; i < list.size(); i++) {
            minus = minus - list.get(i);
        }
        return minus;
    }

    public static double multiply(List<Double> list) {
        double product = 1;
        for (int i = 0; i < list.size(); i++) {
            product = product * list.get(i);
        }
        return product;
    }

    public static double divide(List<Double> list) {
        //被除数为list的第一个数
        double dividend = list.get(0);
        double divideResult = 0;
        for (int i = 1; i < list.size(); i++) {
            dividend = dividend / list.get(i);
        }
        return dividend;
    }

}
