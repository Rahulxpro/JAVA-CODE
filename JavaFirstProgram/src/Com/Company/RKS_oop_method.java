package Com.Company;

public class RKS_oop_method {
    public static void main(String[] args) {
        // A method is a block of code which only run when it is call
        //you can pass the data known as parameter into a method
        // method are used to perform certain action and they are also known as function
        String  msg =  "Hello friends I'm rahul how are you?";
        FirstMethod(msg);

        // .
    } // end of the method

    //a new method
    public static void FirstMethod(String message){
        // put here you coding blocks
        System.out.println(" " + message);
    }
}
