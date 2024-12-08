
class Vehicle {
    
    protected String regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;

    
    public Vehicle(String regnNumber, double speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    
    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}


class Bus extends Vehicle {
   
    private String routeNumber;

    
    public Bus(String regnNumber, double speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName); 
        this.routeNumber = routeNumber;
    }

   
    @Override
    public void showData() {
        super.showData(); 
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}


class Car extends Vehicle {
    
    private String manufacturerName;

   
    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName); 
        this.manufacturerName = manufacturerName;
    }

   
    @Override
    public void showData() {
        super.showData(); 
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        
        Bus bus = new Bus("AB1234", 80, "Red", "John Doe", "101A");
        bus.showData(); 

        System.out.println(); 

        
        Car car = new Car("XY9876", 120, "Blue", "Jane Smith", "Toyota");
        car.showData(); 
    }
}
