@FunctionalInterface
interface i11{
    public void m1();
}

public class Func_interface2 {
    public static void main(String[] args) {
        i1 obj = ()-> System.out.println("Hello");
        obj.m1();
    }
}
