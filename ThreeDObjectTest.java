import java.util.Scanner;


abstract class ThreeDObject {
    
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}


class Box extends ThreeDObject {
    double length, width, height;

    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

   
    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    
    @Override
    public double volume() {
        return length * width * height;
    }
}


class Cube extends Box {

   
    public Cube(double side) {
        super(side, side, side);  
    }

    
}


class Cylinder extends ThreeDObject {
    double radius, height;

   
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding wholeSurfaceArea method for Cylinder
    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Overriding volume method for Cylinder
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Class Cone which inherits from ThreeDObject
class Cone extends ThreeDObject {
    double radius, height;

    // Constructor to initialize dimensions
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding wholeSurfaceArea method for Cone
    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height); // Slant height of cone
        return Math.PI * radius * (radius + slantHeight);
    }

    // Overriding volume method for Cone
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Box
        System.out.print("Enter the dimensions of the Box (length, width, height): ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        ThreeDObject box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // For Cube
        System.out.print("Enter the side length of the Cube: ");
        double side = scanner.nextDouble();
        ThreeDObject cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // For Cylinder
        System.out.print("Enter the dimensions of the Cylinder (radius, height): ");
        double radius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        ThreeDObject cylinder = new Cylinder(radius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // For Cone
        System.out.print("Enter the dimensions of the Cone (radius, height): ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        ThreeDObject cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
