package Interface_code;

interface i4{
    default void display1(){
        System.out.println("Hello");
    }
}

interface i5{
    default void display1(){
        System.out.println("welcome");
    }
}

public class Interface3 implements i4,i5{
    public void display1(){
        i4.super.display1();
        i5.super.display1();
    }
}

class Main8{
    public static void main(String[] args) {
        Interface3 obj = new Interface3();
        obj.display1();
    }
}
