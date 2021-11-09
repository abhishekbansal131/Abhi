public class Overloading5 {
    public static void m5(float obj){
        System.out.println("hello");
    }
    public static void m5(double s){
        System.out.println("welcome");
    }
}

class Test9{
    public static void main(String[] args) {
        Overloading5.m5(102);
    }
}
