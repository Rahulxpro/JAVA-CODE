public class Code_Test {
    public static void main(String[] args) {

        //Inheritance : is use to implement the "is-a" relation.
        //composition : is use to implement thr "has-a" relationship

        // design 1
        Point center =  new Point(5,5);
        Circle c1 =  new Circle(center,15);
        System.out.println(c1.CalculateArea());

        // design2 not need
        Circle c2 = new Circle(5,5,15);
        System.out.println(c2.CalculateArea());
    }
}
