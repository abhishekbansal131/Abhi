abstract public class Anonymous_class1 {
    abstract public void m1();
    }


//class Inherit extends Anonymous_class1{
//    public void m1(){
//        System.out.println("Inside m1");
//    }
//}

class Anony_Main{
    public static void main(String[] args) {

//        Inherit obj = new Inherit();
//        obj.m1();

        Anonymous_class1 obj = new Anonymous_class1() {
            @Override
            public void m1() {
                System.out.println("Inside m1");
            }
        };
        obj.m1();
    }
}
