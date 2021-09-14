import java.util.Scanner;

public class Demo1 {
    public int a;
    public String b;

    public void setValue(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        sc.nextLine();
        b=sc.nextLine();
    }

    public void printValue(){
        System.out.println(a + "\t" + b);
    }
}

class DemoMAin{
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.setValue();
        obj.printValue();
    }

}
