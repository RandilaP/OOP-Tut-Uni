public class TutorialClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius of circle1 is " + circle1.getRadius());
        System.out.println("Area of circle1 is " + circle1.getArea());
        Circle circle2 = new Circle(8);

        System.out.println("Radius of circle2 is " + circle2.getRadius());
        System.out.println("Area of circle2 is " + circle2.getArea());
    }
}
