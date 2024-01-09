package FileTest;

import java.io.*;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-09  11:18
 * @Description: TODO
 */

public class ReaderTest {
    public static void main(String[] args) {
        File file = new File("schedule-study/src/FileTest/file3.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            char[] chars=new char[100];
            inputStreamReader.read(chars);
            String s = new String(chars);
            System.out.println(s);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
