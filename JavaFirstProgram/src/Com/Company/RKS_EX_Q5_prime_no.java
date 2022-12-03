package Com.Company;

import java.util.Scanner;

public class RKS_EX_Q5_prime_no {
    public static void main(String[] args) {
        //display prime no 1 to n

        // Part 1 :-  Getting number from user

        Scanner scan =  new Scanner(System.in);
        System.out.print(" Please Enter a N Number = ");
        int n = scan.nextInt();

        int num =0;

        // part 2 Algorithm of prime number
        String PrimeNumber =  "";

        for(int i =1; i<=n; i++)
        {
            int counter = 0;

            for (num = i; num>=1; num --){

                if(i%num ==0){

                    counter ++;
                }
            }
            //7:  1,7 counter 2
            // 8: 1,2,4,8 counter 4

            if (counter==2)
            {
                // Appending the prime number to the String
                PrimeNumber = PrimeNumber + i+ " ";
            }
        }
        System.out.println(" Prime NO From 1 to N are : =  " + PrimeNumber);
    }
}
