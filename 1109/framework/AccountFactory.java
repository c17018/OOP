package framework;
import framework.Factory;
import framework.Product;
import java.util.List;
import java.util.ArrayList;

public class AccountFactory extends Factory
{

    private List<String> accounts = new ArrayList<String>();
    private List<String> passwords = new ArrayList<String>();
    
    @Override
    protected Product createProduct(String account, String password)
    {
        return new Account(account,password);
    }

    @Override
    protected void registerProduct(Product product)
    {
        accounts.add(((Account)product).getAccount());
        passwords.add(((Account)product).getPassword());
    }

    public List getAccounts()
    {
        return accounts;
    }
}