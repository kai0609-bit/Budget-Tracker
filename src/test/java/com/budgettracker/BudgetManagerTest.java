package com.budgettracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetManagerTest {

    @BeforeEach
    void setUp() {
        BudgetManager.resetTotalTransactions();
    }

    // Test1: addTransaction should increment totalTransactions when it is called.
    @Test
    void testAddTransaction() {
        Transaction t = new Transaction("T1", "Salary", 2500.0, "salary");

        BudgetManager manager = new BudgetManager();
        manager.addTransaction(t);

        assertEquals(1, manager.getTotalTransactions());
    }

    // Test2: findById should return successfully
    @Test
    void testFindTransactionById() {
        Transaction t = new Transaction("T1", "Salary", 2500.0, "salary");

        BudgetManager manager = new BudgetManager();
        manager.addTransaction(t);
        Optional<Transaction> result = manager.findById("T1");
        assertTrue(result.isPresent());
        assertEquals("T1", result.get().getId());
    }

    // Test3: findById should throw Optional.empty
    @Test
    void testFindTransactionByIdNotFound() {
        Transaction t = new Transaction("T1", "Invalid", 2500.0, "other");

        BudgetManager manager = new BudgetManager();
        manager.addTransaction(t);
        Optional<Transaction> result = manager.findById("T99");
        assertFalse(result.isPresent());
    }
}
