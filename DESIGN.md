# Personal Finance Tracker - Design Document

## 1. System Overview

A command-line application for tracking personal income and expenses with categorization and reporting features.

## 2. Architecture

### Layered Architecture Pattern
```
┌─────────────────────────────────┐
│      Presentation Layer         │
│         (ConsoleUI)             │
└────────────┬────────────────────┘
             │
┌────────────▼────────────────────┐
│      Service Layer              │
│  (TransactionService, etc.)     │
└────────────┬────────────────────┘
             │
┌────────────▼────────────────────┐
│      Repository Layer           │
│    (TransactionRepository)      │
└────────────┬────────────────────┘
             │
┌────────────▼────────────────────┐
│      Data Storage               │
│    (transactions.txt)           │
└─────────────────────────────────┘
```
