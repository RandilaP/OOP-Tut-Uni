public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        double volume = getArea() * height;
        return volume;
    }

    public double getArea(){
        double area = 2 * Math.PI * getRadius() * height + 2 * super.getArea();
        return area;
    }


}