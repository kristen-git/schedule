package cartTest;

import cartTest.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-11  13:56
 * @Description: TODO
 */

public class ShoppingItem {
    public List<Product> shoppingProduct(){
        List<Product> arrayList = new ArrayList<>();
        Product p1 = new Product(1,"小米9手机红色128G",1999,10,"电子数码");
        Product p2 = new Product(2,"苹果13手机白色128G",5999,10,"电子数码");
        Product p3 = new Product(3,"《红与黑》",49,10,"书籍类");
        Product p4 = new Product(4,"《三国演义》",59,10,"书籍类");
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        return arrayList;
    }
}

