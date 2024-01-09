package ThreadTest;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  14:56
 * @Description: TODO
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("多线程运行"+i);
        }
    }
}
