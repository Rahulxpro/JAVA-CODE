package Com.Company;

public class RKS_EX_13 {
    public static void main(String[] args) {
        // create a java program that rotate an array clock wise one time
        // {10,20,30,40,50} ---> {50,10,20,30,40}
        int [] my_array =  new int[]{10,20,30,40,50};
        int temp =  my_array[my_array.length-1];
        for(int i =my_array.length-1; i> 0; i--){
            my_array[i]=my_array[i-1];
        }
        my_array[0]=temp;
        for(int i = 0 ; i<my_array.length; i++){
            System.out.print(" " + my_array[i] + " ");
        }
    }
}
