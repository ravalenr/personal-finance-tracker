package com.finance.model;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private String id;
    private String description;
    private double amount;
    private LocalDate date;
    private Category category;
    private TransactionType type;

    // Constructor
    public Transaction(String description, double amount, LocalDate date,
                       Category category, TransactionType type) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.type = type;
    }

    // Getters and Setters
    public String getId() { return id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public TransactionType getType() { return type; }
    public void setType(TransactionType type) { this.type = type; }

    @Override
    public String toString() {
        return String.format("%s | %s | $%.2f | %s | %s",
                date, type, amount, category, description);
    }
}