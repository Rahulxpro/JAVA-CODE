import java.util.ArrayList;

public class Code_Test_Wrapper_class {
    public static void main(String[] args) {
        // Creating Arraylist of String
        ArrayList<Integer> list = new ArrayList<>();

        // Wrapper class
        // A class that wraps (store) primitive data as an object

        Integer y= 18;          //Wrapping the  candy
        Integer z =y.intValue();// opening the candy
        Integer x =19;
        Integer T = x.intValue();
        list.add(y);
        list.add(z);
        System.out.println(list);

    }
}
