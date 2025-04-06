import java.util.*;
public class FinanceManager {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // User create with name ,email, password in finance Manger 
    System.out.println("Enter your Name: ");
     String name=sc.nextLine();
    System.out.println("Enter your Email");
     String email=sc.nextLine();
    System.out.println("Enter your Balance");
    double balance=sc.nextDouble();
      User user=new User(name, balance, email);
    System.out.println("User created Successfully");
     user.displayUser();

    //  User Balnace modification;
    System.out.println("Current balance is: "+user.getBalance());
    System.out.println("Enter amount to add: ");
    user.addBalance(sc.nextDouble());
    System.out.println("updated Balance :"+ user.getBalance());
    System.out.println("Enter amount to deduct: ");
    user.deductBalance(sc.nextDouble());
    System.out.println("updated Balance :"+ user.getBalance());
    

      //  Step 2: Adding Transactions (Inheritance Check)
      Income salary = new Income(5000, "2025-04-01", "Salary");
      Expense shopping = new Expense(2000, "2025-04-02", "Shopping");
      Investment stocks = new Investment(3000, "2025-04-03", "Stocks", 10.5);

      // Display Transactions
      salary.displayTransaction();
      shopping.displayTransaction();
      stocks.displayTransaction();

      //  Step 4: Budget Strategy Selection (Polymorphism Check)
      BudgetStrategy strategy = new BalancedBudget();  // User selects Balanced strategy
      strategy.analyzeBudget(user.getBalance(), 2000);

      //  Step 5: AI-Based Spending Analysis (Abstraction Check)
      AIAnalyzer ai = new SmartAIAnalyzer();
      ai.detectedAnomaly(2000, 1000); // AI checks if spending is unusual
   }
}

