package Com.Company;

public class RKS_oop_class_parameter {
    public static void main(String[] args) {
        String msg  =  "Hello Friends . I'm  Rahul How Are you ?";
        int myRating = 5;
        boolean rateStatus= true;
        FirstMethod(msg,myRating,rateStatus);
    }// end of the main method
    // a new method
    public static  void FirstMethod( String Message, int ratting , boolean state){
        //put here your coding blocks
        System.out.println(" " + Message +" "+ ratting + " Stars " + " Did you rate us ? " + state);
    }
}
