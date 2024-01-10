public class Testing {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 20,"M");
        System.out.println(jack);
        Student beth = new Student("Beth", 19, "F", 2131);
        System.out.println(beth);

        Teacher sam = new Teacher("Sam",32,"M", "Computer Science", 100000);
        System.out.println(sam);
    }
}
