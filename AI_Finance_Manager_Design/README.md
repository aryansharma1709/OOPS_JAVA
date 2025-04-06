# AI Finance Manager Design

## Overview
The AI Finance Manager is a Java-based application designed to help users manage their finances effectively. It incorporates object-oriented programming principles such as inheritance, polymorphism, abstraction, and encapsulation. The system allows users to track their income, expenses, and investments, analyze budgets using different strategies, and detect anomalies in spending patterns using AI.

## Features
1. **User Management**:
   - Create a user with a name, email, and initial balance.
   - Add or deduct balance with proper validation.
   - Display user details.

2. **Transaction Management**:
   - Record transactions categorized as Income, Expense, or Investment.
   - Display transaction details.

3. **Budget Analysis**:
   - Analyze budgets using different strategies:
     - **ConservativeBudget**: Save 50% of income.
     - **BalancedBudget**: Save 30%, spend 50%, and invest 20%.
     - **AggressiveBudget**: Invest 70% of income in assets.

4. **AI-Based Spending Analysis**:
   - Detect anomalies in spending patterns using AI.

## Class Structure
### 1. `User`
- Manages user details and balance.
- Methods: `addBalance`, `deductBalance`, `getBalance`, `displayUser`.

### 2. `Transaction`
- Base class for financial transactions.
- Subclasses:
  - `Income`
  - `Expense`
  - `Investment` (includes expected return details).

### 3. `BudgetStrategy`
- Interface for budget analysis strategies.
- Implementations:
  - `ConservativeBudget`
  - `BalancedBudget`
  - `AggressiveBudget`

### 4. `AIAnalyzer`
- Abstract class for AI-based analysis.
- Implementation: `SmartAIAnalyzer`.

### 5. `FinanceManager`
- Main class to interact with the system.
- Demonstrates the functionality of all components.

## How to Run
1. Compile all Java files:
   ```bash
   javac *.java
   ```
2. Run the `FinanceManager` class:
   ```bash
   java FinanceManager
   ```

## Example Usage
1. Create a user by entering name, email, and balance.
2. Modify the user's balance by adding or deducting amounts.
3. Add transactions for income, expenses, and investments.
4. Choose a budget strategy to analyze income and expenses.
5. Use AI to detect anomalies in spending patterns.

## Design Principles
- **Encapsulation**: User details and balance are private, accessed via methods.
- **Inheritance**: `Transaction` is the base class for `Income`, `Expense`, and `Investment`.
- **Polymorphism**: Budget strategies implement the `BudgetStrategy` interface.
- **Abstraction**: `AIAnalyzer` provides an abstract method for anomaly detection.

## File Structure
```
/home/aryan-sharma/Desktop/OOPs/
├── AI_Finance_Manager_Design/
│   ├── User.java
│   ├── Transaction.java
│   ├── SmartAIAnalyzer.java
│   ├── ConservativeBudget.java
│   ├── BudgetStrategy.java
│   ├── FinanceManager.java
│   ├── BalancedBudget.java
│   ├── AIAnalyzer.java
│   ├── AggressiveBudget.java
└── README.md
```



