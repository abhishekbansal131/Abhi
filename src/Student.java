import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
}
class PrintName{
    public static void main(String[] args) {
        Student obj = new Student();
        if(obj.name.length()==0)
            System.out.println("Unknown");
        else
            System.out.println(obj.name);
    }
}
