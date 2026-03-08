package com.budgettracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TransactionTest {

    // Test1: Does Class Transaction work properly?
    @Test
    void testValidTransaction() {
        Transaction t = new Transaction("T1", "Salary", 2500.0, "salary");
        assertEquals("T1", t.getId());
        assertEquals("Salary", t.getDescription());
        assertEquals(2500.0, t.getAmount());
        assertEquals("salary", t.getCategory());
    }

    // Test2: When amount = 0, is exception occur properly?
    @Test
    void testZeroAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Transaction("T2", "Invalid", 0.0, "other");
        });
    }

    // Test3: if id = null, is exception occur properly?
    @Test
    void testBLankIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Transaction("", "Test", 100.0, "other");
        });
    }
}
