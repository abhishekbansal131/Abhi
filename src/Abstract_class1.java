abstract public class Abstract_class1 {
    abstract public void draw();
}

class Circle1 extends Abstract_class1{
    public void draw(){
        System.out.println("Drawing circle");
    }
}

class Rectangle1 extends Abstract_class1{
    public void draw(){
        System.out.println("drawing circle");
    }
}

class TestAbstraction{
    public static void main(String[] args) {
        Abstract_class1 obj = new Abstract_class1() {
            @Override
            public void draw() {
                System.out.println("Drawing");
            }
        };
        obj.draw();
    }
}

