import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("0.00");

        System.out.println("What is your bill?");                                                            //Asks for bill
        double totalBill = scan.nextDouble();                                                                //Initializes bill

        System.out.println("What is your tip percentage?");                                                  //Asks for tip percent
        int tipPercentage = scan.nextInt();                                                                  //Initializes tip amount

        System.out.println("How many people are splitting the bill?");                                       //Asks for the number of people
        int numberOfPeople = scan.nextInt();                                                                 //Initializes the number of people

        double tip = (double) tipPercentage / 100 + 1;                                                       //Converts the tip into a double that can be multiplied with bill to find total bill
        double totalBillWithTip = totalBill * tip;                                                           //Calculates the total bill including the tip
        double totalPerPerson = totalBillWithTip / numberOfPeople;                                           //Calculates how much each person has to pay
        double totalTip = totalBillWithTip - totalBill;                                                      //Calculates how much the total tip is
        double tipPerPerson = totalTip / numberOfPeople;                                                     //Calculates how much in tips each person has to pay
        System.out.println("Your total tip amount is: $" + moneyFormat.format(totalTip));                    //Prints out the total tip amount
        System.out.println("Your total bill is: $" + moneyFormat.format(totalBillWithTip));                  //Prints out the total bill including tip
        System.out.println("The tip person will be: $" + moneyFormat.format(tipPerPerson));                  //Prints out how much each person has to pay for tips
        System.out.println("And the total per person will be: $" + moneyFormat.format(totalPerPerson));      //Prints out how much each person has to pay in total
    }
}
