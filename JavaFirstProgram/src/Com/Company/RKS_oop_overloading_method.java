package Com.Company;

public class RKS_oop_overloading_method {
    public static void main(String[] args) {
        double result2=SumNumber(1.5,2.3,0.1);
        int result1 = SumNumber(45,25);
        System.out.println(result1);
        System.out.println(result2);

    }
    // add two no and return the result
    public static int SumNumber(int x,int y){
        int result= x +y ;
        return result;
    }
    // method overloading
    public static  double SumNumber(double x , double y, double z){
        double result = x+y+z;
        return result;
    }
}
