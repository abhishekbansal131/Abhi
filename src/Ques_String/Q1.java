package Ques_String;

import java.util.Scanner;

//palindrome

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag=0;
        for(int i=0; i<s.length(); i++){
            flag=0;
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                flag=1;
            }
            else{
                System.out.println("Not palindrome");
                break;
            }
        }

        if(flag==1){
            System.out.println("Palindrome");
        }
    }
}
