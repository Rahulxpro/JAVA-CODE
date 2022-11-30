package Com.Company;

import java.util.Scanner;

public class RKS_EX1 {
    public static void main(String[] args) {
        // calculate cbsc board result percentage
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please input 0 to 100");

        System.out.println("Enter obtain Physics Marks");
        int phy = Scan.nextInt();
        System.out.println("Enter Obtain English Marks");
        int Eng = Scan.nextInt();
        System.out.println("Enter Obtain Chemistry Marks");
        int Che = Scan.nextInt();
        System.out.println("Enter Obtain Math Marks");
        int Math = Scan.nextInt();
        System.out.println("Enter Obtain Hindi Marks");
        int Hindi =  Scan.nextInt();
        float percentage =  ((phy+Che+Math+Eng+Hindi)/500.0f)*100;
        System.out.println("PERCENTAGE  = " + percentage);

    }
}
