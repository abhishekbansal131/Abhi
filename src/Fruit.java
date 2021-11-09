public class Fruit {
    String name;
    String Taste;

    public void eat(){

    }
}

class Apple extends Fruit{
    public void eat(){
        name = "Apple";
        Taste = "Sweet";
        System.out.println(name + " Tastes " + Taste);
    }
}
class Orange extends Fruit{
    public void eat(){
        name = "Orange";
        Taste = "Sour";
        System.out.println(name + " Tastes " + Taste);
    }
}

class Main090{
    public static void main(String[] args) {
        new Apple().eat();
        new Orange().eat();
    }
}
