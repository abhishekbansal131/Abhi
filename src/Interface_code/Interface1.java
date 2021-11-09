package Interface_code;

interface i1{
    int a=10; //implicitly public static final
    void display(); // implicitly public abstract
}

public class Interface1 implements i1 {
    public void display(){
        System.out.println("Hello");
    }
}
class Main9{
    public static void main(String[] args) {
        Interface1 obj = new Interface1();
        obj.display();
        System.out.println(i1.a);
    }
}

