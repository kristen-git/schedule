package ThreadTest;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  14:58
 * @Description: TODO
 */

public class MyRunThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("多线程运行"+i);
        }
    }
}
