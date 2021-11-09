package Git;

/*Q2. At GLA College of  Programming, the final school fees to be paid is calculated as follows.
        •	Original Fees should be greater than or equal to R50 000
        •	Minimum fixed deposit of R10 000
        •	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
        •	Final total fees will also include the following
        1.	School Levy is 10% of original fees
        2.	Sports fee is 5% of the original fees.
        Write a program the calculates the final total fees to be paid.

        Program must request user to enter original fees value greater then R50 000.
        Program should also request user to enter amount to deposit before calculating final total fees.*/

import java.util.Scanner;

public class Fees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original fees which should be greater than 50000");
        double Org_fees = sc.nextDouble();
        System.out.println("Enter the deposite fees....Minimum FIX Deposit is 10000");
        int dep_fees = sc.nextInt();
        double school_levy= (0.10*Org_fees);
        double sports_fes= (0.05*Org_fees);
        if(dep_fees>=Org_fees){
            Org_fees = Org_fees - (0.05*Org_fees);
        }
        double Final=Org_fees+school_levy+sports_fes;
        if(dep_fees<10000)
            System.out.println("Min deposit fees should be 10000");
        else
            System.out.println(Final);
    }
}
