class Counter {
    
    static int count = 0;

   
    public Counter() {
        count++;  
    }

   
    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

   
    public void displayInstanceData() {
        System.out.println("This is an instance method.");
    }
}

public class static_keyword {
    public static void main(String[] args) {
       
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

       
        Counter.displayCount();  

       
        obj1.displayInstanceData();
        obj2.displayInstanceData();
        obj3.displayInstanceData();
    }
}
