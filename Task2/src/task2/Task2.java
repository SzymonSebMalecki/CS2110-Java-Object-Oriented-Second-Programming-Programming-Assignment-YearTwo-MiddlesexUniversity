package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Handler h = new Handler();
        h.read();

        try {
            int choice = 10;
            while (choice != 0) {
                System.out.println(" ");
                System.out.println("Select operation: \n"
                        + "List Event Information................1\n"
                        + "List Competitor Events................2\n"
                        + "List Event's Attempts.................3\n"
                        + "Display All Competition Details.......4\n"
                        + "Exit..................................0\n");
                System.out.print("Enter Choice :> ");
                choice = input.nextInt();
                
                //Option 1: List Event Information
                if (choice == 1) {
                    System.out.println("Select Event Name: \n"
                            + "\nFloor Exercise.........1"
                            + "\nPommel Horse...........2"
                            + "\nStill Rings............3"
                            + "\nVault..................4"
                            + "\nParallel Bars..........5"
                            + "\nHigh Bar...............6"
                            + "\nUneven Bars............7"
                            + "\nBalance Beam...........8");
                    System.out.print("Enter Choice :> ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Select Male or Female:"
                                + "\nMale...............1"
                                + "\nFemale.............2");
                        System.out.print("Enter Choice :> ");
                        choice = input.nextInt();
                        if (choice == 1) {
                            h.displayEventInfo("Floor Exercise(male)");
                        } else if (choice == 2) {
                            h.displayEventInfo("Floor Exercise(female)");
                        } else {
                            System.out.println("Invalid Selection");
                            System.out.println("Please Try Again");
                        }
                    } else if (choice == 2) {
                        h.displayEventInfo("Pommel horse");
                    } else if (choice == 3) {
                        h.displayEventInfo("Still Rings");

                    } else if (choice == 4) {
                        System.out.println("Select Male or Female"
                                + "\nMale...............1"
                                + "\nFemale.............2");
                        System.out.print("Enter Choice :> ");
                        choice = input.nextInt();
                        if (choice == 1) {
                            h.displayEventInfo("vault(male)");
                        } else if (choice == 2) {
                            h.displayEventInfo("vault(female)");
                        } else {
                            System.out.println("Invalid Selection");
                            System.out.println("Please Try Again");
                        }
                    } else if (choice == 5) {
                        h.displayEventInfo("Parallel Bars");
                    } else if (choice == 6) {
                        h.displayEventInfo("High Bar");
                    } else if (choice == 7) {
                        h.displayEventInfo("Uneven Bars");
                    } else if (choice == 8) {
                        h.displayEventInfo("Balance Beam");
                    } else {
                        System.out.println("Invalid Selection");
                        System.out.println("Please Try Again");
                    }
                } //Option 2: List Competitor Events
                else if (choice == 2) {
                    input.nextLine();
                    System.out.print("Enter Competitors name: ");
                    String name = input.nextLine();
                    h.displaycompetitorevent(name);
                } else if (choice == 3) { // Option 3: List Event's Attempts
                    System.out.println("Select Event Name\n"
                            + "\nFloor Exercise.........1"
                            + "\nPommel Horse...........2"
                            + "\nStill Rings............3"
                            + "\nVault..................4"
                            + "\nParallel Bars..........5"
                            + "\nHigh Bar...............6"
                            + "\nUneven Bars............7"
                            + "\nBalance Beam...........8");
                    System.out.print("Enter Choice :> ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Select Male or Female "
                                + "\nMale...............1"
                                + "\nFemale.............2");
                        System.out.print("Enter Choice :> ");
                        choice = input.nextInt();
                        if (choice == 1) {
                            h.displayeventattempts("Floor Exercise(male)");
                        } else if (choice == 2) {
                            h.displayeventattempts("Floor Exercise(female)");
                        } else {
                            System.out.println("Invalid Selection");
                            System.out.println("Please Try Again");
                        }
                    } else if (choice == 2) {
                        h.displayeventattempts("Pommel horse");
                    } else if (choice == 3) {
                        h.displayeventattempts("Still Rings");

                    } else if (choice == 4) {
                        System.out.println("Select Male or Female "
                                + "\nMale...............1"
                                + "\nFemale.............2");
                        System.out.print("Enter Choice :> ");
                        choice = input.nextInt();
                        if (choice == 1) {
                            h.displayeventattempts("vault(male)");
                        } else if (choice == 2) {
                            h.displayeventattempts("vault(female)");
                        } else {
                            System.out.println("Invalid Selection");
                            System.out.println("Please Try Again");
                        }
                    } else if (choice == 5) {
                        h.displayeventattempts("Parallel Bars");
                    } else if (choice == 6) {
                        h.displayeventattempts("High Bar");
                    } else if (choice == 7) {
                        h.displayeventattempts("Uneven Bars");
                    } else if (choice == 8) {
                        h.displayeventattempts("Balance Beam");
                    } else {
                        System.out.println("Invalid Selection");
                        System.out.println("Please Try Again");
                    }

                } 
                else if (choice == 4) { //Option 4: Display All Competition Details
                    h.displaycompetition();

                } //Option 4: Exit
                else if (choice == 0) {
                    System.out.println("Program Terminated");
                } else {
                    System.out.println("Invalid Selection");
                    if (choice > 4 | choice < 0) {
                        System.out.println(choice + " is not a valid input");
                    }
                    System.out.println("Please Try Again");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Program Will Now Terminate");
            System.out.println("Please Try Again");
        }
    }
}
