// Import Scanner to read Walmart employee's input
import java.util.Scanner;
public class WalmartSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare variables
        int baseSalary;
        int noOfServiceYears;
        double bonus;
        int totalSales;
        double additonalBonus;
        //Get salesperson's baseSalary
        System.out.print("Enter salesperson's base salary: ");
        baseSalary = input.nextInt();
        //Get salesperson's number of years worked at Walmart
        System.out.print("Enter salesperson's service years: ");
        noOfServiceYears = input.nextInt();
        //find out what the salesperson's bonus will be
        if (noOfServiceYears <= 5) {
            bonus = 10 * noOfServiceYears;
        }
        else {
            bonus = 20 * noOfServiceYears;
        }
        //get salespersons total sales
        System.out.print("Enter salesperson's total sales for the month: ");
        totalSales = input.nextInt();
        // find out what the salespersons additional bonus will be
        if (totalSales >= 5000 && totalSales < 10000) {
            // if total sales is between 5000 to 10000 then they get 3% commission
            additonalBonus = totalSales * (0.03);
        }
        else {
            // if the total sales is above 10000 then make it times 6%
            if (totalSales >= 10000) {
                additonalBonus = totalSales * (0.06);
            }
            // make additional bonus = 0 if the totalsales is less than 5000
            else {
                additonalBonus = 0;
            }
        }
        //calculate salesperson's paycheck
         double payCheck = baseSalary + bonus + additonalBonus;
        System.out.println("Total pay: " + payCheck);
        // close input
        input.close();
    }
}
