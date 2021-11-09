package Interface_code;

interface i6{
    void m1();
    void m2();
    default void m3(){
        //Either write some statements or make it empty for overriding
    }
}

class First implements i6{
    public void m1(){
        System.out.println("Hey");
    }
    public void m2(){
        System.out.println("Hii");
    }
}

class Second implements i6{
    public void m1(){
        System.out.println("Hey 2");
    }
    public void m2(){
        System.out.println("Hii 2");
    }
    public void m3(){
        System.out.println("World");
        i6.super.m3();
    }
}

class Main6{
    public static void main(String[] args) {
        Second obj = new Second();
        obj.m3();
    }
}

public class Interface4 {
}
