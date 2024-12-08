
class Person {
    
    String name;
    int age;

    
    public Person(String name, int age) {
       
        this.name = name;  
        this.age = age;    
    }

    
    public void displayInfo() {
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age);   
    }

    
    public void setDetails(String name, int age) {
       
        this(name, age);  
    }

    
    public Person() {
        this("Unknown", 0); 
    }
}

public class this_keyword {
    public static void main(String[] args) {
       
        Person person1 = new Person("Alice", 25);
        person1.displayInfo();

        System.out.println(); 

        
        Person person2 = new Person();
        person2.displayInfo();
    }
}

