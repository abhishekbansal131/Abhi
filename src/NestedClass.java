public class NestedClass {
    int a=10;
    class inner{
        int a=20;
        public void show(){
            int a=30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NestedClass.this.a);
        }
    }
    public void display(){
        inner obj = new inner();
        obj.show();
    }
}
class Pq{
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
    //    NestedClass.inner obj2 = obj.new inner();
    //    obj2.show();
        obj.display();
    }
}