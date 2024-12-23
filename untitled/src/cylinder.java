public class Cylinder {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * (height + radius);
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + " and height: " + height;
    }
}