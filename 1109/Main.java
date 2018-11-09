import framework.Factory;
import framework.Product;
import framework.AccountFactory;
import framework.Account;

public class Main
{
    public static void main(String[] args)
    {
        Factory factory  = new AccountFactory();
        Product account1 = factory.create("ムササビ", "007");
        Product account2 = factory.create("CCO", "SecretSwordTsu");
        Product account3 = factory.create("HAa", "0000");
        Product account4 = factory.create("daigo", "daigo3DAIgosun");

        account1.use();
        account2.use();
        account3.use();
        account4.use();  

        System.out.println(((AccountFactory)factory).getAccounts());

    }
}