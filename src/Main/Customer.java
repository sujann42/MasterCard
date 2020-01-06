    package Main;

    public class Customer {


        public static void main(String[] args) {
          GoldCard goldCard= new GoldCard();
          goldCard.printCardInfo();
            System.out.println("\n-----------------------------\n");

          Platinum platinum= new Platinum();
          platinum.printCardInfo();


            System.out.println("\n-----------------------------\n");


            PlatinumPreferred platinumPreferred= new PlatinumPreferred();
            platinumPreferred.printCardInfo();

        }






    }
