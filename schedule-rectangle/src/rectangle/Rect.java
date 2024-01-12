package rectangle;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-12  09:06
 * @Description: TODO
 */

public class Rect {
    public double width;
    public double height;

    public Rect() {
        this(10, 10);
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
