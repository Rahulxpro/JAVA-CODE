public class Code_Test {
    public static void main(String[] args) {
        // Inheritance : is use to implement the "is-a" relationship
        //composition : is used to implement the "has-a" relationship

        Shape shape1 =  new Circle(10,5,4);
        Shape shape2 =  new Rectangle(15,10);
        Shape shape3 =  new Triangle(7,5,1,2,3);


       // for shape 3 Triangle
        System.out.println("Perimeter of Triangle =  "+shape3.CalculatePerimeter());
        System.out.println("Area of Triangle =       "     +shape3.CalculateArea());

        //for shape 1 Circle
        System.out.println("Perimeter of Circle =    "+ shape1.CalculatePerimeter());
        System.out.println("Area of Circle =         "     + shape1.CalculateArea());

        //for shape 2 Rectangle
        System.out.println("Perimeter of Rectangle = "+shape2.CalculatePerimeter());
        System.out.println("Area of Rectangle =      "    +shape2.CalculateArea());
    }
}
