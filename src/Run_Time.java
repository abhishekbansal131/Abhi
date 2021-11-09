public class Run_Time {
    public void m1(){
        System.out.println("hello");
    }
}

class Run_time2 extends Run_Time{
    public void m1(){
        System.out.println("hii");
    }
}

class Main90{
    public static void main(String[] args) {
        Run_Time obj = new Run_time2();
        obj.m1();
    }
}
