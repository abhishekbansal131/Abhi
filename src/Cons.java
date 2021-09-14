public class Cons {
    private int roll;
    private String name;
    int std;
    // Here we use getter and setter to access the private variables.
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test{
    int a;
    Cons obj;
// Now we use constructor to initialize the variables or to allocate the memory by creating object.
    Test(){
        a=90;
        obj=new Cons();
        obj.setRoll(13);
        obj.setName("Abhishek bansal");
    }
}

class TestMain{
    public static void main(String[] args) {
        Test obj2=new Test();
        System.out.println(obj2.a);
        System.out.println(obj2.obj.getRoll());
        System.out.println(obj2.obj.getName());
    }
}
