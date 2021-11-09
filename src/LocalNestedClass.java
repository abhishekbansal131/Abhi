import java.util.Scanner;

public class LocalNestedClass {
    public void m1(String key){
        class inner{
            public void isLocked(){
                if(key=="1234")
                    System.out.println("valid key");
                else
                    System.out.println("Invalid key");
            }
        }
        new inner().isLocked();
    }
}

class LockMAins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    new LocalNestedClass().m1(sc.next());
    }
}
