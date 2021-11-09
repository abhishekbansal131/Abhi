package p1;

public class Stupackage {
    protected int rollno;
    public String name;

    public Stupackage(){
        rollno=10;
        name="abhishek bansal";
    }

    public Stupackage(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    protected void show(){
        System.out.println(rollno + " " + name);
    }
}

//class MAinC{
//    public static void main(String[] args) {
//        Stupackage obj = new Stupackage();
//        System.out.println(obj.rollno);
//    }
//}

class AbA extends Stupackage{
    public static void main(String[] args) {
        Stupackage obj = new Stupackage();
        System.out.println(obj.rollno);
    }
}



