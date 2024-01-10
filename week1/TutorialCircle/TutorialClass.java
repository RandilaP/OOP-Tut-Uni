public class TutorialClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius of circle1 is " + circle1.getRadius());
        System.out.println("Area of circle1 is " + circle1.getArea());
        System.out.println("Color of circle1 is " + circle1.getColor());

        Circle circle2 = new Circle(8);
        System.out.println("Radius of circle2 is " + circle2.getRadius());
        System.out.println("Area of circle2 is " + circle2.getArea());
        System.out.println("Color of circle2 is " + circle2.getColor());

        Circle circle3 = new Circle(5, "Red");
        System.out.println("Radius of circle3 is " + circle3.getRadius());
        System.out.println("Area of circle3 is " + circle3.getArea());
        System.out.println("Color of circle3 is " + circle3.getColor());
    }
}
