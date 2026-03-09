package com.budgettracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BudgetManager manager = new BudgetManager();
        InteractiveUI ui = new InteractiveUI();

        while (true) {
            ui.showMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                // Add transaction.
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter month (1 - 12): ");
                    int month = Integer.parseInt(sc.nextLine());
                    if (month < 1 || month > 12) {
                        System.out.println("Invalid month. Please enter 1-12.");
                        break;
                    }

                    manager.addTransaction(new Transaction(id, description, amount, category, month));
                    break;

                // View all transaction
                case 2:
                    manager.printAllTransaction();
                    break;

                //
                case 3:
                    System.out.print("Enter month (1 - 12): ");
                    int reportMonth = Integer.parseInt(sc.nextLine());
                    if (reportMonth < 1 || reportMonth > 12) {
                        System.out.println("Invalid month. Please enter 1-12.");
                        break;
                    }


                    manager.monthlyReport(reportMonth);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please select 1-4.");
                    break;

            }


        }


    }
}
