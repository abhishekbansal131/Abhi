import java.util.Scanner;

public class Number2 {
    int Eid;
    String Ename;
    int Esal;
    char comp;

    Number2(){
        Scanner sc = new Scanner(System.in);
        Eid = sc.nextInt();
        Ename=sc.next();
        Esal= sc.nextInt();
        System.out.print("Choose company name Either A or B");
        comp = sc.next().charAt(0);
    }
    public static void result(Number2 a[],int n){
        int s1=0;
        int s2=0;
        for(int i=0; i<n; i++){
            if(a[i].comp=='A'){
                if(s1<a[i].Esal)
                    s1=a[i].Esal;
            }
            else{
                if(s2<a[i].Esal)
                    s2=a[i].Esal;
            }
        }
        System.out.println("Comp A " + s1);
        System.out.println("Comp B " + s2);

    }

}

class NumMAin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number2 arr[] = new Number2[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Number2();
        }
        Number2.result(arr,5);

    }
}
