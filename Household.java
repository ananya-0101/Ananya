import java.util.Scanner;

public class Household {


    // Method for 1c
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int familyMembers = 4;
        double waterConsumed = 450.5;
        int houseNumber = 101;
        char waterUsageStatus = 'A';

        System.out.println("----- 1a) Household Details -----");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);


    
        System.out.println("\n----- 1b) Water Bill -----");

        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        double bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water bill: Rs." + bill);


        
        System.out.println("\n----- 1c) Total Water Consumption -----");

        System.out.print("Enter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: " + total + " litres");

        sc.close();
    }
}
    

