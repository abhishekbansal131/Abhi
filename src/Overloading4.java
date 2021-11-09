public class Overloading4 {
    public static void m4(int obj){
        System.out.println("hello");
    }
    public static void m4(Integer s){
        System.out.println("welcome");
    }
}

class Test8{
    public static void main(String[] args) {
        Overloading4.m4(102);   //first preference goes to primitive datatype here
    }
}

