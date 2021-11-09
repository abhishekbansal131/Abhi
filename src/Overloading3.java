public class Overloading3 {
    public static void m3(Third1 obj){
        System.out.println("hello");
    }
    public static void m3(Second1 s){
        System.out.println("welcome");
    }
}

class First1{}
class Second1 extends First{}
class Third1 extends First{}

class Test7{
    public static void main(String[] args) {
      //  Overloading3.m3(null);  // shows an error creat ambiguity.
    }
}
