package Ques_String;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.concat(s2);
        System.out.println(s1);
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s1.length(); j++){
                if(i!=j){
                    if(s1.charAt(i)==s1.charAt(j)){
                        s1=s1.replace(s1.charAt(i),' ');
                    }
                }
            }
        }

    }
}
