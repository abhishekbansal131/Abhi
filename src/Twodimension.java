public class Twodimension {
    public static void main(String[] args) {
        int[][] arr={{Integer.parseInt(args[0]),Integer.parseInt(args[1])},{Integer.parseInt(args[2]),Integer.parseInt(args[3])}};
        for(int i=1; i>=0; i--){
            for(int j=1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
