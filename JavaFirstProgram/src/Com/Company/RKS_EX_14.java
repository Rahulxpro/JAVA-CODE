package Com.Company;

import java.util.Scanner;

public class RKS_EX_14 {
    public static void main(String[] args) {
        // Create  a Java Program That count the letters , space , numbers and other character of an input string
        Scanner scan = new Scanner(System.in);
        String enteredText =  scan.nextLine();

        // Transforming the String into array
        char[]chars = enteredText.toCharArray();
        //  Checking if the char is space , letter or number
        int space =  0;
        int letter =  0;
        int number =  0;
        int other =  0;
        for(int i = 0; i<enteredText.length(); i++){
            if(Character.isDigit(chars[i])){
                number++;
            } else if (Character.isAlphabetic(chars[i])) {
                letter++;
            } else if (Character.isSpaceChar(chars[i])) {
                space++;
            }else {
                other++;
            }

        }
        System.out.println(" Space : "+ space);
        System.out.println(" Number : " + number);
        System.out.println("Letter : " + letter);
        System.out.println(" other:  " + other);
    }
}
