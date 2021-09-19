public class ArrQ5 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int flag=0;
        for(int i=0; i<arr.length; i++){
            flag=0;
            if(arr[i]==1 || arr[i]==4)
                flag=1;
            else{
                System.out.println("False");
                break;
            }
        }
        if(flag==1)
            System.out.println("True");
    }
}
