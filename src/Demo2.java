import java.util.Scanner;
// Encapsulation concept.
public class Demo2 {
    private int a;
    private String b;
    // Here we use getter and setter to access private variable in main methods.

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;

    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
class Abcd{
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        Scanner sc=new Scanner(System.in);
        obj.setA(sc.nextInt());
        System.out.println(obj.getA());
        sc.nextLine();
        obj.setB(sc.nextLine());
        System.out.println(obj.getB());
    }
}