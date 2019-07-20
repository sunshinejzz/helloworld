package day7$19;

public class Point {
    double x;
    double y;

    //创建对象时必须赋值
    public Point(double x1, double y1){
        x = x1;
        y = y1;
    }

   /* public void setX(double x1){
        x = x1;
    }
    public void setY(double y1){
        y = y1;
    }*/

    public double juli(Point point){
        double index = Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2);
        index = Math.sqrt(index);
        return index;
    }


}
