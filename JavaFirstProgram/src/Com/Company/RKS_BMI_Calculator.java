package Com.Company;

import java.util.Scanner;

public class RKS_BMI_Calculator {
    public static void main(String[] args) {
        // Calculate the BMI
        System.out.println("Please Enter Your Weight In K.G ");
        Scanner scan = new Scanner(System.in);
        float W= scan.nextFloat();

        System.out.println("Please Enter Your Height In Meters");
        float H = scan.nextFloat();

        float BMI = W/(H*H);
        System.out.println("Your BMI Is = " + BMI);

    }
}
