import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();


        Circle circle = new Circle(radius);
        Cylinder cylinder = new Cylinder(radius, height);


        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}