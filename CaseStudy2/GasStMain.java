package CaseStudy2;

import java.util.Scanner;

public class GasStMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GasStQueue gasSt = new GasStQueue();

        while (true) {
            System.out.println("\n--- Gas Station Menu ---");
            System.out.println("1. Add to Queue");
            System.out.println("2. Display Queue");
            System.out.println("3. Check Queue Length");
            System.out.println("4. Serve Queue");
            System.out.println("5. Display Transaction History");
            System.out.println("0. Exit System");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter plate number: ");
                    String plateNum = sc.nextLine();
                    System.out.print("Enter vehicle type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter vehicle brand: ");
                    String brand = sc.nextLine();
                    Vehicle newVehicle = new Vehicle(plateNum, type, brand);
                    gasSt.enqueue(newVehicle);
                    break;
                case 2:
                    System.out.println("-- Vehicle Queue --");
                    gasSt.displayQueue();
                    break;
                case 3:
                    System.out.println(">> Number of vehicle in queue: " + gasSt.getSize());
                    break;
                case 4:
                    Vehicle served = gasSt.dequeue();
                    if (served != null) {
                        System.out.println("Serves " + served.plateNum);
                        System.out.print("Enter fuel type: ");
                        String gasName = sc.nextLine();
                        System.out.print("Enter price per liter: ");
                        Double pricePerLiter = sc.nextDouble();
                        System.out.print("Enter the number of liters: ");
                        double liter = sc.nextInt();
                        System.out.println(">> The transaction is successfully recorded");
                        Gasoline gasoline = new Gasoline(gasName, pricePerLiter);
                        double totPayment = liter * pricePerLiter;
                        Transaction transaction = new Transaction(served, gasoline, liter, totPayment);
                        gasSt.addHistory(transaction);

                    }
                    break;
                case 5:
                    System.out.println("-- Transaction History --");
                    gasSt.displayHistory();
                    break;
                case 0:
                    System.out.println("Exiting Program");
                    return;
                default:
                    System.out.println("Invalid choice! please try again");
                    break;
            }

        }

    }
}