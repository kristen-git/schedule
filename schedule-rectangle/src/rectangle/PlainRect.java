package rectangle;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-12  09:12
 * @Description: TODO
 */

public class PlainRect extends Rect{
    public double startX;
    public double startY;

    public PlainRect(double width, double height, double startX, double startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        this(0,0,0,0);
    }
    public boolean isInside(double x,double y){
        return x >= startX && x <= (startX + super.width) && y < startY && y >= (startY - super.height);
    }
}
