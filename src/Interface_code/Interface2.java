package Interface_code;

interface i2{
    void m1();
}

interface i3{
    void m1();
}

public class Interface2 implements i2,i3{
    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.m1();
    }
        public void m1(){
            System.out.println("Hello");
        }

    }


