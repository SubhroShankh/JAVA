import java.util.Scanner;

class Circle{
    
    double radiusOfCircle;

    Circle(double radiusOfCircle){
        this.radiusOfCircle = radiusOfCircle;
    }
    
    double getCircumference(){
        return 2 * Math.PI * radiusOfCircle;
    }
    
    double getArea(){
        return Math.PI * Math.pow(radiusOfCircle, 2);
    }
        
    public String toString() {
        return String.format(
            "--- Circle Details ---\n" +
            "Radius: %.2f\n" +
            "Area: %.2f\n" +
            "Circumference: %.2f",
            radiusOfCircle, getArea(), getCircumference()
        );
    }    
        
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.println("Welcome to the world of circles\n");
        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}