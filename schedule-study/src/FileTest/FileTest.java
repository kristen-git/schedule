package FileTest;

import java.io.*;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  08:55
 * @Description: File类与IO流的学习
 */

public class FileTest {
    public static void main(String[] args) {
        //FileInputStream-读取
        //FileOutputStream-写入
        //FileBufferReader-FileBufferWriter

        try {
            File file = new File("schedule-study/src/FileTest/file1.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[3];
            String s = "";
            while ((fileInputStream.read(bytes)) != -1) {
                s += new String(bytes, "UTF-8");
            }
            System.out.println(s);//12345,上山打老虎

            fileInputStream.close();

            File file2 = new File("schedule-study/src/FileTest/file2.txt");
            FileOutputStream fileOutputStream=new FileOutputStream(file2);
            String s1="12345,上山打老虎";
            byte[] bytes1 = s1.getBytes();
            fileOutputStream.write(bytes1);

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
