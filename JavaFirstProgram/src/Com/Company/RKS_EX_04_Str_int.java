package Com.Company;

public class RKS_EX_04_Str_int {
    public static void main(String[] args) {
        // convert String to integer
        String y="10";
        String z="8";
        int i =  Integer.parseInt(y);
        int n =  Integer.parseInt(z);
        System.out.println(y+z);  // string y+z= 10+8= 108
        System.out.println(i+n); // int i+n =  y+z = 10+8 = 18

        // convert integer to string
        int b=100;
        String l= String.valueOf(b);
        System.out.println(b+y);
        System.out.println(l);

    }
}
