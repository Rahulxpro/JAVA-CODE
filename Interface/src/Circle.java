public class Circle implements Shape{
    int x;
    int y;
    double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public double CalculateArea() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double CalculatePerimeter() {
        return (2*Math.PI*radius);
    }
}
