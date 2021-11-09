// Here we are discussing the concept of aggregation.

public class StaticNestedClass {
    int a=10;
    static class inner{
        int b=20;
        public void show(){
            StaticNestedClass obj = new StaticNestedClass();
            System.out.println(obj.a + " " + b);
        }
    }
}

class TEst{
    public static void main(String[] args) {
        StaticNestedClass.inner obj = new StaticNestedClass.inner();
        obj.show();
    }
}
