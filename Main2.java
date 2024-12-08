
class Distance {
   
    protected double distanceInMiles;

    
    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

   
    public void travelTime() {
        double speedInMilesPerHour = 60.0;
        double time = distanceInMiles / speedInMilesPerHour;
        System.out.println("Time taken to cover the distance of " + distanceInMiles + " miles at a speed of 60 miles per hour is: " + time + " hours.");
    }
}


class DistanceMKS extends Distance {

    
    public DistanceMKS(double distanceInMiles) {
        super(distanceInMiles);
    }

    
    @Override
    public void travelTime() {
        
        double distanceInKilometers = distanceInMiles * 1.60934;
        double speedInKmPerSecond = 100.0; 
        
       
        double timeInSeconds = distanceInKilometers / speedInKmPerSecond;
        
        
        double timeInHours = timeInSeconds / 3600;
        double remainingSeconds = timeInSeconds % 3600;
        double timeInMinutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        
        System.out.println("Time taken to cover the distance of " + distanceInKilometers + " kilometers at a speed of 100 km per second is: "
                + String.format("%.2f", timeInHours) + " hours, "
                + String.format("%.2f", timeInMinutes) + " minutes, and "
                + String.format("%.2f", remainingSeconds) + " seconds.");
    }
}

public class Main2 {
    public static void main(String[] args) {
       
        Distance distanceInMiles = new Distance(120);
        distanceInMiles.travelTime(); 
        System.out.println();

        
        DistanceMKS distanceInKilometers = new DistanceMKS(120);
        distanceInKilometers.travelTime(); 
    }
}
