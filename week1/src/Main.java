public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person p = new Person("ben");
        Person e = new Person("emily");
        Person c = new Person("Charlie");
        p.setSurname("Camero");
        p.setAge(29);
        c.setSurname("Root");
        c.setAge(40);
        e.setSurname("Sugar");
        e.setAge(30);

        p.displayName();
        System.out.println(p.getAge()+" "+p.getSurname());
        e.displayName();
        System.out.println(e.getAge()+" "+e.getSurname());
        c.displayName();
        System.out.println(c.getAge()+" "+c.getSurname());
    }
}