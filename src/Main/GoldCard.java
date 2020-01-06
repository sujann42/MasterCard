package Main;

public class GoldCard {
    private  String cardType="GoldCard";
    private static final double creditLimit=1000;
    private  double initialBalance=0.0;
    private  double cardIssueFee=0.0;
    private double pointsEarned=0.0;
    private double amountCharged=100.0;


    public String getCardType() {
        return cardType;
    }
    public static double getCreditLimit() {
        return creditLimit;
    }
    public double getInitialBalance() {
        return initialBalance;
    }
    public double getCardIssueFee() {
        return cardIssueFee;
    }
    public double getPointsEarned() {
        return pointsEarned;
    }

    public double remBalance (double balance){
        balance = creditLimit- balance;
        return balance;
    }


    public void printCardInfo(){
        System.out.println("Type: "+ cardType);
        System.out.println("Card Issue Fee: " +cardIssueFee );
        System.out.println("Initial balance: "+ initialBalance);
        System.out.println("Credit Limit: "+ creditLimit);

        for (double i=100.0; i<=creditLimit;i+=100){
            System.out.println("Amount charged/ Current Balance/ Available Points: "+amountCharged+"|"+i+"|"+pointsEarned);
        }





    }
}
