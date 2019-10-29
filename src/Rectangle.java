public class Rectangle {
    double l;
    double w;

//define a constructor method for Rectangle class here

    public Rectangle(double x, double y){
        l=x;
        w=y;
    }

    public void area(){
        double a = l*w;
        System.out.println("Area of Rectangle: " +a);
    }
}
