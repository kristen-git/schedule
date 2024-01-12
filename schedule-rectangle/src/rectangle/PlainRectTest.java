package rectangle;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-12  09:32
 * @Description: TODO
 */


class PlainRectTest {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(20, 10, 10, 10);
        System.out.println("矩形的面积为：" + plainRect.area());
        System.out.println("矩形的周长为：" + plainRect.perimeter());
        if (plainRect.isInside(25.5, 13)) {
            System.out.println("该点在矩形内");
        } else {
            System.out.println("该点不在矩形内");
        }
    }

}