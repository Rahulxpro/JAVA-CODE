package Com.Company;

import java.util.Scanner;

public class RKS_EX1_Compare_2_num {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Please Enter NUM1 = ");
        int num1= scan.nextInt();
        System.out.print("Please Enter NUM2 = ");
        int num2= scan.nextInt();
        if(num1>num2){
            System.out.println("Num1 is Greater then Number2");
        }else if(num1< num2){
            System.out.println("Num  is Greater then Number1");
        }else {
            System.out.println("num1 is Greater");
        }

    }
}
