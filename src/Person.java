public class Person {
    public int age;
    public String name;
    Person(int a,String n){
        age = a;
        name =n ;
    }
}
class Stude extends Person{
    public int id;
    public int marks;

    Stude(int a, String n, int id, int marks){
        super(a,n);
        this.id=id;
        this.marks=marks;
    }
}

class Teach extends Person{
    public int salary;
    public String sub;

    Teach(int a,String n, int salary, String sub){
        super(a,n);
        this.salary =salary;
        this.sub= sub;
    }
}
