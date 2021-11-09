public class Q112 {
    public void display1(){
        System.out.println("in class outer");
    }
    class inner1{
        public void display1(){
            System.out.println("In inner class");
        }
    }
}

class Main000{
    public static void main(String[] args) {
        Q112 obj = new Q112();
        Q112.inner1 obj2 = obj.new inner1();
        obj.display1();
        obj2.display1();
    }
}