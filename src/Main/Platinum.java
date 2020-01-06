package Main;

public class Platinum {
    private String CardType = "Platinum";
    private double Platinum_limit = 1500;
    private double Platinum_fee = 50;
    private double amountCharged = 100.0;
    private double initialBalance;
    private double pointsEarned;




    public double UpdateBalance(double amount) {
        double balance = Platinum_limit - amount;
        return balance;
    }

    public double UpdatePoints(double amount) {
        double points = amount / 2;
        return points;
    }




    public void printCardInfo() {
        System.out.println("Type: " + CardType);
        System.out.println("Card Issue Fee: " + Platinum_fee);
        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Credit Limit: " + Platinum_limit);

        double sum=0.0;
        for (double i = 100.0; i <= Platinum_limit; i += 100) {
            double pointsEarned=(i-50)/2;

            System.out.println("Amount charged/ Current Balance/ Available Points: " +
                    amountCharged + "|" + i + "|" + pointsEarned);
        }


    }
}
