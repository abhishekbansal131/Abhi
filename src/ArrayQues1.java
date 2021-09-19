import java.util.Scanner;

public class ArrayQues1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int flag=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            flag=0;
            if(arr[i]==n){
                System.out.println(i);
                break;}
            else{
                flag=1;
            }
        }
        if(flag==1)
            System.out.println("-1");




    }


}
