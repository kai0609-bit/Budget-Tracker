package com.budgettracker;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Optional; 
import java.util.stream.Collectors;

public class BudgetManager implements Searchable{
    static int totalTransactions = 0;
    
    Map<String, Transaction> transactions = new HashMap<>();

    void addTransaction(Transaction transaction) {
        transactions.put(transaction.getId(), transaction);

        totalTransactions++;
    }

    public Optional<Transaction> findById(String id) {
        return Optional.ofNullable(transactions.get(id));
    }

    void printStats() {
        double totalAmount = transactions.values().stream()
            .filter(t -> t.getAmount() > 0)
            .mapToDouble(Transaction::getAmount)
            .sum();
        
        double totalExpenses = transactions.values().stream()
            .filter(t -> t.getAmount() < 0)
            .mapToDouble(Transaction::getAmount)
            .sum();

        double balance = totalAmount + totalExpenses;
        
        List<Transaction> expenses = transactions.values().stream()
            .filter(t -> t.getAmount() < 0)
            .toList();

        System.out.println("Total number of transactions: " + totalTransactions);
        System.out.println("Total income: " + totalAmount);
        System.out.println("Total expenses: " + totalExpenses);
        System.out.println("Balance: " + balance);

        expenses.forEach(t -> 
            System.out.println(t.getDescription() + ": " + t.getAmount() + " [" + t.getCategory() + "]")
        );
    }
}
