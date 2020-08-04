package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        TradersHandler th = new TradersHandler();

        boolean Choice;
        Scanner input = new Scanner(System.in);
        int choice;

        try {
            th.readTraderDataFromFile();
            Choice = true;

            while (Choice == true) {
                System.out.println(" ");
                System.out.println("List Traders .................1\n"
                        + "Select Trader.................2\n"
                        + "Search Location...............3\n"
                        + "Search Services...............4\n"
                        + "Exit..........................0");
                System.out.print("Enter Choice :> ");
                choice = input.nextInt();

                switch (choice) {
                    case 0:
                        Choice = false;
                        System.out.println("Program Will Now Terminate");
                        break;
                    case 1:
                        th.displayAllTraderData();
                        break;
                    case 2:
                        System.out.print("Enter Trader ID from list :> ");
                        int id = input.nextInt();
                        th.displayCompanyName(id);
                        break;
                    case 3:
                        input.nextLine();
                        System.out.print("Enter Location :> ");
                        String location = input.nextLine();
                        th.searchSpecificLocation(location);
                        break;
                    case 4:
                        input.nextLine();
                        System.out.print("Enter Service :> ");
                        String service = input.nextLine();
                        th.searchCompanyServices(service);
                        break;
                    default:
                        System.out.println("Selection Error Occured");
                        if (choice > 4 | choice < 0) {
                            System.out.println(choice + " is not a valid input");
                            System.out.println("Please Try Again");
                            Choice = true;
                            break;
                        }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Program Will Now Terminate");
            System.out.println("Please Try Again");
        }
    }
}
