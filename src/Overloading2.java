public class Overloading2 {
    public static void m2(First obj){
        System.out.println("hello");
    }
    public static void m2(Second s){
        System.out.println("welcome");
    }
}

class First{}
class Second extends First{}
class Third extends Second{}

class Test6{
    public static void main(String[] args) {
        Overloading2.m2(null);  // child class has more preference.
    }
}

