package com.finance;

import com.finance.model.Category;
import com.finance.model.Transaction;
import com.finance.model.TransactionType;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Test creating a transaction
        Transaction groceries = new Transaction(
                "Weekly groceries",
                85.50,
                LocalDate.now(),
                Category.FOOD,
                TransactionType.EXPENSE
        );

        System.out.println("Transaction created:");
        System.out.println(groceries);

        // Test creating income
        Transaction salary = new Transaction(
                "Monthly salary",
                3000.00,
                LocalDate.now(),
                Category.SALARY,
                TransactionType.INCOME
        );

        System.out.println(salary);
    }
}