public class Overloading1 {
    public static void m1(Object obj){
        System.out.println("hello");
    }
    public static void m1(String s){
        System.out.println("welcome");
    }
}

class Test5{
    public static void main(String[] args) {
        Overloading1.m1(null);
    }
}
