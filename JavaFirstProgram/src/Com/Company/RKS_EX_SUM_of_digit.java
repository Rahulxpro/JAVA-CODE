package Com.Company;

import java.util.Scanner;

public class RKS_EX_SUM_of_digit {
    public static void main(String[] args) {
        // sum of the digit
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a  Number to Sum its Digit = ");
        // 27= 20+7 = 9;
        int Number = scan.nextInt();
        // 27 =  20+7 = 27
        //678 =  600+70+8 = 6+7+8;
        int sum = 0;
        while (Number != 0) ;
        {

            sum = sum + Number % 10;
            Number = Number / 10;
        }
        System.out.println(sum);
    }
}