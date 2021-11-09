public class Shape {
    public void draw(){
        System.out.println("Drawing shape");
    }
    public void erase(){
        System.out.println("erasing shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void erase(){
        System.out.println("erasing circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
    public void erase(){
        System.out.println("erasing Triangle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
    public void erase(){
        System.out.println("erasing Square");
    }
}

class Min78{
    public static void main(String[] args) {
        Shape c= new Circle();
        Shape t= new Triangle();
        Shape s = new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}