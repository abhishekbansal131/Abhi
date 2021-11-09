public class LocalNestedClass2 {
    public void m11(){
        class inner{
            int a;
            inner(){
                a=10;
            }
            public void show(){
                System.out.println(a);
            }
        }
        inner obj = new inner();
        obj.show();
    }
}
class MainNested{
    public static void main(String[] args) {
        LocalNestedClass2 obj = new LocalNestedClass2();
        obj.m11();

    }
}