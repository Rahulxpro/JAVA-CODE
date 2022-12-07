package Com.Company;

import java.util.Scanner;

public class RKS_EX_Q_07 {
    public static void main(String[] args) {
        // Create a Java program that allow the user to enter 10 values and given their avg
        // step 1
        System.out.println("Please Enter 10 values :");
        Scanner scan =  new Scanner(System.in);

         // step 2
        int [] my_array = new int[10];
        for(int i =0; i<my_array.length; i++){
            my_array[i] =  scan.nextInt();
        }
        // step 3
        int sum=0;
        int avg=my_array.length;
        for (int i : my_array){
            sum = sum + i;
            avg = sum/my_array.length;
        }
        System.out.println(avg);
    }
}
