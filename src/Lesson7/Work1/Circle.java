package Lesson7.Work1;

public class Circle extends Figure{

private static final String NAME = "Circle";
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    public double getPerimetr(){
        double perimetr = 2*Math.PI*radius;
        return perimetr;
    }

    public  String getName(){
        return NAME;
    }
    public double getRadius(){
        return radius;
    }
    public  void  setRadius (double radius){
        this.radius = radius;
    }

}


