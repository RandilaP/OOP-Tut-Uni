public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "Blue";
    };
    public Circle(double radius){
        radius = radius;
        color = "Blue";
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
