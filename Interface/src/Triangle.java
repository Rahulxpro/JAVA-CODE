public class Triangle implements Shape {
    double base;
    double height;
    double a;
    double b;
    double c;

    public Triangle(double base, double height, double a, double b, double c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double CalculateArea() {
        return (base*height)/2;
    }

    @Override
    public double CalculatePerimeter() {
        return (a+b+c);
    }
}
