package com.budgettracker;

public class Main {
    public static void main(String[] args) {

        BudgetManager manager = new BudgetManager();

        try {
            manager.addTransaction(new Transaction("t1", "Salary", 2500.0, "salary"));
            manager.addTransaction(new Transaction("t2", "Rent", -800.0, "rent"));
            manager.addTransaction(new Transaction("t3", "Groceries", -150.0, "food"));
            manager.addTransaction(new Transaction("t4", "Freelance", 500.0, "salary"));

            manager.addTransaction(new Transaction("t5", "Invalid", 0.0, "other"));
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        manager.findById("t2")
            .ifPresent(t -> System.out.println("Found: " + t.getDescription()));
        
        manager.findById("t99")
            .ifPresentOrElse(
                t -> System.out.println("Found: " + t.getDescription()),
                () -> System.out.println("Not Found")
            );

        System.out.println(" --- ");
        manager.printStats();
    }
}
