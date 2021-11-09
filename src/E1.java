//public class E1 {
//    public static void main(String[] args) {
//        if(true)
//            System.out.println("Acs");
//        System.out.println("abx");
//        System.out.println("G"+'l'+"A");
//        double d = 0xBeef;
//        System.out.println(d);
//        int x;
//        if(args.length>0)
//            x=13;
//        else
//            x=14;
//        System.out.println(x);
////        for(int i=0; 0; i++){
////            System.out.println("Hellllo");
////            break;
////        }
//        int String=1;
//        System.out.println(String);
//        double aa=10;
//        System.out.println(aa-String);
//    }
//}

interface i111{
    void m1();
    void m2();
}

abstract class ATM implements i111{
    public void m1(){
        System.out.println("In m1");
    }
    public void m2(){
        System.out.println("in m2");
    }
}

public class E1{
    public static void main(String[] args) {
        ATM obj = new ATM() {
            @Override
            public void m1() {
                super.m1();
            }

            @Override
            public void m2() {
                super.m2();
            }
        };
        obj.m1();
        obj.m2();
    }
}
