abstract public class Abstract2 {
    public int a;
    Abstract2(){
        a=10;
    }
}
class first extends Abstract2{
    int b;
    first(){
        super();
        b=20;
    }
}
class AbstractA{
    public static void main(String[] args) {
        first obj = new first();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
}

