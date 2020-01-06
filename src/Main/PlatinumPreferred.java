package Main;

public class PlatinumPreferred {
    private String CardType = "PlatinumPref";
    private double PlatinumPref_limit = 2000;
    private double PlatinumPref_fee = 100;
    private double amountCharged=100;
    private double initialBalance;
    private double pointsEarned;





    public void printCardInfo() {
        System.out.println("Type: " + CardType);
        System.out.println("Card Issue Fee: " + PlatinumPref_fee);
        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Credit Limit: " + PlatinumPref_limit);

        double sum=0.0;
        for (double i = 100.0; i <= PlatinumPref_limit; i += 100) {
            double pointsEarned=(i-100);

            System.out.println("Amount charged/ Current Balance/ Available Points: " +
                    amountCharged + "|" + i + "|" + pointsEarned);
        }


    }



}
