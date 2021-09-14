public class Commandline {
    int a;
    int b;

    Commandline(int x, int y){
        a=x;
        b=y;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Commandline obj= new Commandline(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        obj.show();
    }
}
