public class ArrQ4 {
    public static void main(String[] args) {
        int[] arr={1,6,4,7,9};
        int b=0,c=0,sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==6)
                b=i;
            if(arr[i]==7)
                c=i;
        }
        if(b>c){
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }
        }
        else{
            for(int i=0; i<b; i++){
                sum+=arr[i];
            }
            for(int i=c+1; i<arr.length; i++){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
