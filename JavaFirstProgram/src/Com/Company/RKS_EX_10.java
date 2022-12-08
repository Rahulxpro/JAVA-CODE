package Com.Company;

public class RKS_EX_10 {
    public static void main(String[] args) {
        // create java program that find the max and min of array.
        int [] my_array = {50,14,15,56,144,99,55,1};
        // finding min
        int min = my_array[0];
        for(int i =1; i<my_array.length; i++){
            if(my_array[i] < min){

                min= my_array[i];
            }
        }
        System.out.println(" The min in This array " + min);

        // find max value
        int[] my_Array1 = {25,14,15,56,144,99,55,1};
        // finding max
        int max =  my_Array1[0];
        for(int i = 1; i< my_Array1.length; i++){
            // comparing the value of element  with max
            if(my_Array1[i]>max){
                // switch the largest element
                max =my_Array1[i];
            }
        }
        System.out.println("The max value in This array " + max);
    }
}
