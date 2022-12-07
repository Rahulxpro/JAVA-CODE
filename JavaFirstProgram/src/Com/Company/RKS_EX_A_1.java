package Com.Company;

import java.util.Scanner;

public class RKS_EX_A_1 {
    public static void main(String[] args) {
        // Wrote a java program that allow the user to enter
        // 1st to 10th numbers and given their sum
        // step 1
        System.out.println("Please Enter The 10 values ");
        Scanner scan = new Scanner(System.in);

        // step 2
        int[] my_arrays =  new int[10];
        for( int i = 0; i<my_arrays.length; i++){
            my_arrays[i]=scan.nextInt();
        }
        //3rd step finding the sum
        int sum = 0;
        for (int i : my_arrays){
            sum =  sum + i;
        }
        System.out.println(sum);
    }
}
