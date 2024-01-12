package cartTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-11  13:55
 * @Description: TODO
 */

public class Cart {
    public static void main(String[] args) {
        //首先展示最新的商品列表
        ShoppingItem shoppingItem = new ShoppingItem();
        List<Product> products = shoppingItem.shoppingProduct();
        //我的购物车
        ArrayList<Product> myProducts = new ArrayList<>();

        while (true) {
            //通过Switch case进入选项
            System.out.println("欢迎来到我的KK宝购物");
            System.out.println("【1】商品列表");
            System.out.println("【2】我的购物车");
            System.out.println("【3】退出");
            System.out.println("请输入您的选择：");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < products.size(); i++) {
                        Product product = products.get(i);
                        System.out.println("id为：" + (i + 1) +
                                "商品价格为：" + product.getPrice() +
                                "商品数量为：" + product.getNumber() +
                                "商品名称为：" + product.getName() +
                                "商品信息为" + product.getInformation());
                    }
                    System.out.println("【1】选取商品加入购物车");
                    System.out.println("【2】退出首页");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("选取几号商品：");
                            int choice3 = scanner.nextInt();
                            System.out.println("您选取的商品为：");
                            Product product = products.get(choice3 - 1);
                            System.out.println("id为：" + (choice3 - 1 + 1) +
                                    "商品价格为：" + product.getPrice() +
                                    "商品数量为：" + product.getNumber() +
                                    "商品名称为：" + product.getName() +
                                    "商品信息为" + product.getInformation());
                            myProducts.add(product);
                            System.out.println("已成功添加入购物车");
                            if (product.getNumber() < 1) {
                                System.out.println("该商品数量为0，无法购买！");
                                break;
                            }

                        case 2:
                            continue;
                        default:
                            System.out.println("该编号不存在");
                            break;
                    }

                case 2:
                    if(myProducts.size()>0) {
                        System.out.println("我的购物车商品为：");
                        for (int i = 0; i < myProducts.size(); i++) {
                            Product myProduct = myProducts.get(i);
                            System.out.println("id为：" + myProduct.getId() +
                                    "商品价格为：" + myProduct.getPrice() +
                                    "商品数量为：" + myProduct.getNumber() +
                                    "商品名称为：" + myProduct.getName() +
                                    "商品信息为" + myProduct.getInformation());
                        }
                    }else{
                        System.out.println("您的购物车空空如也");
                        System.out.println("-----即将回到主页-----");
                    }
                    continue;
                case 3:
                    System.out.println("感谢您的光临，再见了");
                    return ;
                default:
                    continue;
            }

        }
    }
}
