public class Q114 {
    public int l,b,h;
    Q114(){
        l=10;
        b=10;
        h=10;
    }
}
class Box3d extends Q114{
    int a,v;
    public void areaa(){
        a=2*(l*b + b*h + h*l);
        System.out.println(a);
    }
    public void Volume(){
        v=l*b*h;
        System.out.println(v);
    }
}

class MAin588{
    public static void main(String[] args) {
        Box3d obj = new Box3d();
        obj.areaa();
        obj.Volume();
    }
}
