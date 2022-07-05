
import java.util.*;

public class ElectricityBill {

    int unitsConsumed;   // Units Consumed by the user
    int remainingUnits;  // To find each time remaining units if more than  200 units are consumed by the user

    double billAmount_First_200_Units; // Bill Amount for first 200 units ( between 1-200 )
    double billAmount_Next_300_Units = 0.0; // Bill Amount for next 300 Units (between 200 - 500)
    double billAmount_Over_500_Units = 0.0; // Bill Amount for over 500 Units (Above 500 and more)
    double subTotalOfBillAmount;  // Sum of billAmount_First_200_Units + billAmount_Next_300_Units + billAmount_Over_500_Units
    double totalBillAmountPayable = 0.0; // Total Amount payable after checking the pay cycle Duration Time

    String payCycleDuration; // To store the response from user regarding the payment time duration
    boolean payCycleStatus = true; // To handle the default case od Switch to stop the call of display method

    // Enter the Units Consumed
    public void enterUnitsConsumed(Scanner input) {
        System.out.println("Enter the number of Units Consumed by the Consumer");
        unitsConsumed = input.nextInt(); // Store units Consumed
    }

    // Calculate the bill Amount
    public void computeElectricityBill(Scanner input) {
        // Check the unitsConsumed to Find bill can be generated or not
        if (unitsConsumed <= 0) {
            payCycleStatus = false;
            System.out.println("At least 1 unit should be consumed by the consumer for getting a bill Amount");
        } else {
            // Business Logic
            if (unitsConsumed > 200) {
                billAmount_First_200_Units = 2.5 * 200;
                remainingUnits = unitsConsumed - 200;
                if (remainingUnits > 300) {
                    billAmount_Next_300_Units = 3.5 * 300;
                    remainingUnits = remainingUnits - 300;
                    billAmount_Over_500_Units = 5.0 * remainingUnits;
                } else {
                    billAmount_Next_300_Units = 3.5 * remainingUnits;
                }

            } else {
                billAmount_First_200_Units = 2.5 * unitsConsumed;
            }

            // User can select the number of days taken for paying the bill
            System.out.println("Choose from the two options given below:\n" +
                    "\t 0. Consumer Pays after 15 days (Press 0 from Keyboard to select this Option)\n " +
                    " \t 1. Consumer Pays within 15 days(Press 1 from Keyboard to select this Option)");
            payCycleDuration = input.next();

            // Sub Total Sum of individual bills
            subTotalOfBillAmount = billAmount_First_200_Units + billAmount_Next_300_Units + billAmount_Over_500_Units;

            // business Logic
            switch (payCycleDuration) {

                case "0":
                    totalBillAmountPayable = subTotalOfBillAmount + (0.05 * subTotalOfBillAmount);
                    break;
                case "1":
                    totalBillAmountPayable = subTotalOfBillAmount - (0.10 * subTotalOfBillAmount);
                    break;
                default:
                    payCycleStatus = false;
                    System.out.println("Please select correct option");
                    break;
            }

        }
    }

    // Display the bill Amount
    public void displayBillAmount() {
        System.out.println("Total Bill Amount Payable by the Consumer:" + String.format("%.2f", totalBillAmountPayable));
    }





    public static void main(String[] args) {

        // creation of Object of Class ElectricityBill
        ElectricityBill bill = new ElectricityBill();
        // creation of Object of Class Scanner
        Scanner input = new Scanner(System.in);
        // Calling enterUnitsConsumed method with input as parameter
        bill.enterUnitsConsumed(input);
        // Calling computeElectricityBill method with input as a parameter
        bill.computeElectricityBill(input);

        // Calling the display method
        if (bill.payCycleStatus) {
            bill.displayBillAmount();
        }






    }


}