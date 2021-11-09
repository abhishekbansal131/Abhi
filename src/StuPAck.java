import p1.Stupackage;
public class StuPAck extends Stupackage{
    public StuPAck(int rollno, String name){
        super(rollno, name);
    }
    public static void main(String[] args) {
     //   Stupackage obj1 = new Stupackage();
        StuPAck obj2 = new StuPAck(1,"Abhi");

        System.out.println(obj2.rollno);
        obj2.show();
    }
}
