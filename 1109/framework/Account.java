package framework;
import framework.Product;

public class Account extends Product
{

    private String account;
    private String password;

    Account(String account, String password)
    {
        System.out.println("Create account: " + account);
        System.out.println("Create password: " + password);
        this.account = account;
        this.password = password;
    }

    @Override
    public void use()
    {
        System.out.println("Use account: " + account);
    }

    public String getAccount()
    {
        return account;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}