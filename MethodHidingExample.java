
class Parent {
    
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}


class Child extends Parent {
    
    public static void display() {
        System.out.println("Static method in Child class");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
       
        Parent.display(); 

        
        Parent obj = new Child();
        obj.display(); 

        
        Child.display();
    }
}
 