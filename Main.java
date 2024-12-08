
class Num {
   
    protected int number;

   
    public Num(int number) {
        this.number = number;
    }


    public void shownum() {
        System.out.println("The number is: " + number);
    }
}


class HexNum extends Num {

   
    public HexNum(int number) {
        super(number);
    }

    
    @Override
    public void shownum() {
        super.shownum();  
        
        System.out.println("Hexadecimal value: " + Integer.toHexString(number));
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class Main {
    public static void main(String[] args) {
       
        Num num = new Num(123);
        num.shownum(); 

        System.out.println(); 

        
        HexNum hexNum = new HexNum(123);
        hexNum.shownum(); 
    }
}

    

