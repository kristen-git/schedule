package CollectionTest;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  17:28
 * @Description: TODO
 */

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("A");
        strings.add("#");
        strings.add("a");

        System.out.println(strings);

        System.out.println("-----------");

        TreeSet<String> strings1 = new TreeSet<>();
        strings1.add("a");
        strings1.add("b");
        strings1.add("c");
        strings1.add("A");
        strings1.add("#");
        strings1.add("a");
        System.out.println(strings1);

    }
}
