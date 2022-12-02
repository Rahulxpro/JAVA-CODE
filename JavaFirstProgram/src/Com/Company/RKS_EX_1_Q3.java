package Com.Company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RKS_EX_1_Q3 {
    public static void main(String[] args) {

        //  Q3 Sum Of Digit fo a number
        //Entering by the number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number TO Sum Of Its Digit ");
        int num =  scan.nextInt();
        // 27  =  20+7 = 2+7
        // 678 = 600+70+8
        int sum=0;
        while (num !=0){
            sum = sum + num %10;
            num = num/10;
        }
        System.out.println(sum);

    }
}
