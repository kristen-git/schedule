package ThreadTest;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  14:56
 * @Description: TODO
 */

public class ThreadTest {
    public static void main(String[] args) {
//        //多线程——继承thread类
        Thread myThread = new MyThread();
        myThread.start();
        //多线程——实现runnable接口
        MyRunThread myRunThread = new MyRunThread();
        Thread thread = new Thread(myRunThread);
        thread.start();

    }
}
