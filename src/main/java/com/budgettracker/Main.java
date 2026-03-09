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

                    manager.addTransaction(new Transaction(id, description, amount, category));
                    break;

                // View all transaction
                case 2:
                    manager.printAllTransaction();
                    break;

                //
                case 3:
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

            }


        }


    }
}
