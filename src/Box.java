public class Box {
    int width,height,depth;
    Box(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }
    public String Volume(){
        int vol=width*height*depth;
        return "The volume of the box is " + vol;
    }
}
class Volume{
    public static void main(String[] args) {
        Box obj = new Box(10,10,20);
        System.out.println("The dimensions of box are given below");
        System.out.println(obj.depth + " " + obj.height + " " + obj.width);
        System.out.println("The volume of box is given below");
        System.out.println(obj.Volume());
    }
}