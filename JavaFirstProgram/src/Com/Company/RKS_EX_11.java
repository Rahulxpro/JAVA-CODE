package Com.Company;

public class RKS_EX_11 {
    public static void main(String[] args) {
        //write a java program that reverse an array
        int [] my_array = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i<my_array.length/2; i++){
            int Temp =  my_array[i];
            my_array[i]=my_array[my_array.length-i-1];
             my_array[my_array.length-i-1] = Temp ;
            System.out.print(my_array[i]);
           // System.out.print(Temp);

        }

    }
}
