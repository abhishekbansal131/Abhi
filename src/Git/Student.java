package Git;

import java.util.Scanner;

public class Student {
    String name,program;
    int age;
    Student(String name, String program, int age){
        this.name=name;
        this.age=age;
        this.program=program;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
    }
}

class Graduate_Student extends Student{
    double per;
    String stream;
    Graduate_Student(String name, String program, int age, double per, String stream){
        super(name,program,age);
        this.per=per;
        this.stream=stream;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(per);
        System.out.println(stream);
    }
}

class Research_Student extends Student{
    String specl;
    int year;
    Research_Student(String name, String program, int age, String specl, int year){
        super(name,program,age);
        this.specl=specl;
        this.year=year;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(specl);
        System.out.println(year);
    }
}

class StuMain{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Graduate_Student obj1 = new Graduate_Student("Abhishek bansal", "B.tech", 20, 88.5, "Cs");
        Research_Student obj2 = new Research_Student("Ayush bansal", "M.tech", 25,"Cloud computing", 4 );
        obj1.display();
        obj2.display();
    }
}