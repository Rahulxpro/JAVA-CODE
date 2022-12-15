public class Circle {


    // Circle consist of a center (point x , y) and radius

    int x; //
    int y; //
    Point center ;
    double radius;
    //design 1
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    //design 2 its not need
    public Circle(int x, int y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    // area of circle
    public double CalculateArea(){
        return Math.PI*radius*radius;
    }
}

