public class SmartAIAnalyzer extends AIAnalyzer {
    public void detectedAnomaly(double amount,double averageSpending)
    {
        if(amount>averageSpending*2)
        System.out.println("ALERT!! , high spending Detected");
        else
        {
            System.out.println("Spending is Normal");
        }
    }
}
