package cartTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-11  13:55
 * @Description: 实现简易购物车
 */

public class Product {
    private int id;
    private String name;
    private double price;
    private int number;
    private String information;

    public Product(int id, String name, double price, int number, String information) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.information = information;
    }

    public Product() {

    }

    public Product(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
