import java.util.Scanner;

public class Book {
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, double price, int year, String author){
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

public String toString(){
        return "Title: " + title + ", price: " + price + ", year: " + year + ", author: " + author;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = input.nextDouble();
        System.out.println("Enter the year of the book: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = input.nextLine();
        Book book = new Book(title, price, year, author);
        System.out.println(book);
    }
}