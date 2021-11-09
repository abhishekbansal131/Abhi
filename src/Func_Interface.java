@FunctionalInterface
interface i1{
    public void m1();
   // public void m2(); Only one abstract method can there.
}

@FunctionalInterface
interface i2{
    public void m1();
}

public class Func_Interface implements i1,i2 {
    public void m1(){

    }
}
