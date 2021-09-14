public class Const extends Object {
    private int a;
    Const(){
        a=90;
    }

    public int getA() {
        return a;
    }
}
class Child extends Const{  // Extends keyword used to inherit the const(parent) class into child class)
    public String name;
    Child(){
        name="Abhi";
    }
    public void show(){
        System.out.println(name);
        System.out.println(getA());
    }
}

class Exec{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }

}
