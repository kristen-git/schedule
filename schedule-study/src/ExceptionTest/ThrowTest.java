package ExceptionTest;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  08:49
 * @Description: TODO
 */

public class ThrowTest {
    public static void main(String[] args) throws Exception {
        double a=5; double b=0;
        divide(a,b);

    }
    public static double divide(double a, double b) throws IllegalArgumentException{
        if(b==0){
            throw new IllegalArgumentException("除数不能为0");
        }
        return a/b;
    }
}
