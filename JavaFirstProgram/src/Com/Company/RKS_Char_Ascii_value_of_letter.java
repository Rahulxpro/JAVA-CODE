package Com.Company;

import java.util.Scanner;

public class RKS_Char_Ascii_value_of_letter {
    public static void main(String[] args) {

        //Characters
        char tt = 'j';
        char u = 66;
        char x = '\u03A9';
        char y = '\b';
        String j = "Hello \t World";   // \t = tap
        String j1 = "Hello \b World";  // \b = 2nd word backspace
        String j2 = "Hello \n World"; // \n = skip
        String j3 = "Hello \t World";// \r= deleted and first continue
        String j4 = "Hello \\ World";// \\= \
        String j5 = "Hello \' World";// \\= '
        System.out.println(" \u03A9 Value of is = " +   x);
        System.out.println(j);
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);
        System.out.println(j5);
        char k= 'x';
        Character C = 'x';
        System.out.println(C.isLetter( 'x'));
        System.out.println(C.isDigit( 'x'));
        // print the ascii value  of letter
        System.out.print("Enter the ASCii value = ");
        Scanner scanner= new Scanner(System.in);
        int  m =  scanner.next().charAt(0);
        System.out.print(m);


    }
}
