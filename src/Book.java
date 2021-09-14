
import java.util.Scanner;

public class Book {
    String name,author;
    double price;
    int qtyInStock;

    Book(){
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        author= sc.nextLine();
        price=sc.nextDouble();
        qtyInStock=sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}

class PrintDetails{
    public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("The book details are given below:-");
        System.out.println(obj.getName());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getPrice());
        System.out.println(obj.getQtyInStock());
    }

}
