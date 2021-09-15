import java.util.Scanner;

public class Arr {
    static int sub[];
    Arr(){
        sub=new int[5];
        for(int i=0; i<sub.length; i++){
            Scanner sc = new Scanner(System.in);
            sub[i]=sc.nextInt();
        }
    }
    public static void show(){
//        for(int res : sub){
//            System.out.println(res);
//        }
        for(int i=0; i<sub.length; i++){
            System.out.println(sub[i]);
        }
    }
}

class ArrMain{
    public static void main(String[] args) {
        Arr obj = new Arr();
        Arr.show();
    }
}
