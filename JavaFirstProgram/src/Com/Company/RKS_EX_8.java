package Com.Company;

import java.lang.module.FindException;

public class RKS_EX_8 {
    public static void main(String[] args) {
        // Q8 = create a java program remove element from an array
        int [] my_array = {25,14,56,99,55,63};
        // remove an element 2nd element
        int removingIndex =  1;
        for (int i =  removingIndex; i<my_array.length-1; i++){
            // we are not removing or deleting
            // we are shifting the array to desired index
            my_array[i]= my_array[i+1];
        }
        // let's print the shifted array
        for(int  i = 0; i<my_array.length-1; i++){
            System.out.println(my_array[i]);
        }
    }
}
