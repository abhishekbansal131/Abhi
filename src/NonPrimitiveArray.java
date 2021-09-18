import java.util.Scanner;

public class NonPrimitiveArray {
    int roll;
    String name;

    NonPrimitiveArray(){
        Scanner sc=new Scanner(System.in);
        roll= sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
    }

    public void show(){
        System.out.println(roll);
        System.out.println(name);
    }
}
class NonMain{
    public static void main(String[] args) {
        NonPrimitiveArray arr[] = new NonPrimitiveArray[5];
  //      NonPrimitiveArray obj = new NonPrimitiveArray();

        for(int i=0; i<arr.length; i++){
            arr[i]=new NonPrimitiveArray();
        }
        for(int i=0; i<arr.length; i++){
            arr[i].show();
        }
    }
}
