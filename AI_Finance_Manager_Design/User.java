public class User{
      
    private  String name;
    private  double balance;
    private String email;

    public User(String name ,double balance ,String email){
        this.name=name;
        this.balance=balance;
        this.email=email;
     }

    public double getBalance(){
        return balance;
    }

    public void addBalance(double amount)
    {
        balance+=amount;
       System.out.println("amount added Successfully");
    }

    public void deductBalance(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Successfully debited ");
        }
        else
        {
            double  requiredMoney=amount-balance;
            System.out.println("Insufficient Balance!! you need "+ requiredMoney);
        }
    }
    public void displayUser()
    {
        System.out.println("User: "+name+ " Email: "+email+ " Balance: "+ balance);
    }

}