public class CompileTime {
    public static void m1(){
        System.out.println("hello");
    }
}

class Run_time3 extends CompileTime{
    public static void m1(){
        System.out.println("hii");
    }
}

class Main91{
    public static void main(String[] args) {
        CompileTime obj = new Run_time3();
        obj.m1();
    }
}
