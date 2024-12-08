public class MethodOverloadingExample {

   
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodOverloadingExample obj = new MethodOverloadingExample();

       
        System.out.println("Sum of two integers: " + obj.add(10, 20));

       
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));

       
        System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5));

        
        System.out.println("Sum of an integer and a double: " + obj.add(10, 20.5));
    }
}

