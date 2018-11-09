import framework.Factory;
import framework.Product;
import framework.AccountFactory;
import framework.Account;

public class Main
{
    public static void main(String[] args)
    {
        Factory factory  = new AccountFactory();
        Product account1 = factory.create("Ralph Johnson", "aaa");
        Product account2 = factory.create("Richard Helm", "bbb");
        Product account3 = factory.create("John Vlissides", "ccc");
        Product account4 = factory.create("Erich Gamma", "ddd");

        account1.use();
        account2.use();
        account3.use();
        account4.use();  

        System.out.println(((AccountFactory)factory).getAccounts());

    }
}