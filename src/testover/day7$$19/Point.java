package testover.day7$$19;

public class Point {
    private double x;
    private double y;

    /*构造方法*/
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    /*计算方法*/
    public double ceshi(Point point){
        double index = Math.sqrt(Math.pow(point.x - x ,2) + Math.pow(point.y , 2));
        return index;
    }


}
