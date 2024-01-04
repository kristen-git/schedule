import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-04  10:20
 * @Description: TODO
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要进行的运算（+、-、*、/）");
        String operator = scanner.next();

        System.out.println("请输入第一个操作数");
        double num1 = scanner.nextDouble();

        System.out.println("请输入第二个操作数");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, add(num1, num2));
                break;

            case "-":
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, subtract(num1, num2));
                break;

            case "*":
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, multiply(num1, num2));
                break;

            case "/":
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, divide(num1, num2));
                } else {
                    System.out.println("除数不能为零！");
                }
                break;

            default:
                System.out.println("无效的运算符！");
                break;
        }
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}

