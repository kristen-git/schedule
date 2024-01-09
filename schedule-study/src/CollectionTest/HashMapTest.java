package CollectionTest;

import java.util.HashMap;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-08  20:23
 * @Description: TODO
 */

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("age", "20");
        stringHashMap.put("name", "麻将");
        System.out.println(stringHashMap.entrySet());//[name=麻将, age=20]
        System.out.println(stringHashMap.keySet());//[name, age]

    }


}
