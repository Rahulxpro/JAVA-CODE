package Com.Company;

public class RKS_EX_9 {
    public static void main(String[] args) {
        // create a java  program that insert an element into array
        int [] my_array = {25,14,56,15,36};
        // insert an element (99) at 3rd position
        int index_to_insert =2;
        for(int i = my_array.length-1; i>index_to_insert; i--){
            // inserting = shifting the element from left to  right
            my_array[i]=my_array[i-1];
        }
        //filling up the empty space inside array
        my_array[index_to_insert]=99;
        //printing the array
        for(int i = 0; i<my_array.length; i++){
            System.out.println(my_array[i]);
        }
    }
}
