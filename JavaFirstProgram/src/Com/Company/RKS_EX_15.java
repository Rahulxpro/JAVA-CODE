package Com.Company;

import java.util.Scanner;

public class RKS_EX_15 {
    public static void main(String[] args) {
        //write a java program that reverses  an entered string
        System.out.println("Please Entered a Word");
        Scanner scan=  new Scanner(System.in);
        String enteredword =scan.nextLine();
        String reversedword =  " ";
        // convert the string to char[];
        char[] wordArray =  enteredword.toCharArray();

        //loop in inverse and store the word in the reversedword
        for(int i =  wordArray.length-1; i>=0; i--){
            reversedword += wordArray[i];  //reversedword =  reversedword +wordArray[i];

        }
        System.out.println("The Reversedword " + reversedword);

    }
}
