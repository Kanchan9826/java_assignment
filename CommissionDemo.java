import java.util.Scanner;
class Commission {
private double sales; // Instance variable for sales
// Constructor to initialize sales
public Commission(double sales) {
this.sales = sales;
}
// Method to calculate commission based on sales
public double commission() {
if (sales >= 0 && sales <= 1000) {
return sales * 0.05; // 5% commission for sales <= 1000
} else if (sales <= 5000) {
return sales * 0.1; // 10% commission for sales > 1000 and <= 5000
} else {
return sales * 0.2; // 20% commission for sales > 5000
}
}}
public class CommissionDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Read sales value from the user
System.out.print("Enter sales amount: ");
double sales = scanner.nextDouble();
// Validate the input
if (sales < 0) {
System.out.println("Invalid Input"); // Handle negative sales input
} else {
// Create a Commission object
Commission commissionObj = new Commission(sales);
// Calculate and display the commission
double commission = commissionObj.commission();
System.out.println("The commission for sales of " + sales + " is: " + commission);
}
scanner.close();
}
}