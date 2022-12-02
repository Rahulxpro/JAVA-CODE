package Com.Company;

public class RKS_NESTED_FOR_loop {
    public static void main(String[] args) {
       // type1
        for(int i =1; i<=5; i++){
            for (int j =1; j<=10; j++ ){
                System.out.print("" + j);
            }
            System.out.println();
        }
        // type 2 // j=i , j<=i, i<=j try this
        // decreasing * print

        for(int i =1; i<=5; i++){
            for (int j =i; j<=5; j++ ){
                System.out.print("*" );
            }
            System.out.println();
        }
        // type 3  j<=i (increasing *)
        for(int i =1; i<=5; i++){
            for (int j =1; j<=i; j++ ){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}
