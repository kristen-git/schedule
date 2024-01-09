package CollectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  17:21
 * @Description: TODO
 */

public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("A");
        list1.add("#");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("--------------------");

        Vector<String> strings = new Vector<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("A");
        strings.add("#");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }


    }

}
