public class Transaction {
   protected double amount;
   protected String date;
   protected String category;
   public Transaction(double amount, String date,String category){
       this.amount=amount;
       this.date=date;
       this.category=category;
   } 
   public void displayTransaction(){
    System.out.println("Transaction: " + category+" | Amount: "+ amount+" | Date: "+ date);
   }

}
//---------Income-----------
class Income extends Transaction{
    public Income(double amount, String date,String category){
         super(amount, date, category);
    }
}
// -----------Expense-----------------
class Expense extends Transaction{
    public Expense(double amount, String date,String category){
         super(amount, date, category);
    }
}
// --------------Investment-----------------
class Investment extends Transaction{
    private double expectedReturn;
    public Investment(double amount, String date,String category,double expectedReturn){
         super(amount, date, category);
         this.expectedReturn=expectedReturn;
    }
    public void showInvestmentDetails()
    {
        System.out.println("Investment Expected Return: " + expectedReturn);
    }
}


