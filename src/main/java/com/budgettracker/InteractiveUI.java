package com.budgettracker;

public class InteractiveUI {
    InteractiveUI () {}

    public void showMenu () {
        System.out.println("=== Budget Tracker ===");
        System.out.println("1. Add transaction");
        System.out.println("2. View all transaction");
        System.out.println("3. Monthly report");
        System.out.println("4. Exit");
        System.out.print("Select: ");
    }
}
