public interface Shape {
    // Code Sharing isn't useful in this case,because each class implement its behavior different


    //  Area                           perimeter
    // circle =  pi*r*r                2 * pi * R
    // Rectangle =  l * W              2(L+b)
    //Triangle =  h * b/2              a + b + c

     public double CalculateArea();
     public double CalculatePerimeter();

     //Interface :  can only contain method headers and class contains
}
