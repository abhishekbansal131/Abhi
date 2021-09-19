import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        String s = String.valueOf(n); // to convert int to string

        for(int i=0; i<s.length(); i++){
            flag=0;
            if(s.charAt(i)==s.charAt(s.length()-i-1))
                flag=1;
            else{
                System.out.println("Not palindrome");
                break;
            }
        }
        if(flag==1)
            System.out.println("Palindrome");
    }
}
