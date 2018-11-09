import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
import idcard.IDCard;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("山内公之", 777);
        Product card2 = factory.create("山田花子", 666);
        Product card3 = factory.create("山本太郎", 7);
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory) factory).getOwners());
        System.out.println(((IDCardFactory) factory).getNos());
    }
}

        /*
         * import java.util.Map; 
         * import java.util.HashMap;
         * 
         * public class Main
         * { 
         *      public static void main(String [] args)
         *      {
         *          Map<String, String> cards = new HashMap<String, String>(); 
         *          cards.put("1", "山内");
         *          cards.put("2", "山田"); 
         *          System.out.println(cards); 
         *      } 
         * }
         * 
         * 
         */