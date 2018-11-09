package framework;

public abstract class Factory
{
    public final Product create(String account, String password)
    {
        Product product = createProduct(account, password);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String account, String password);

    protected abstract void registerProduct(Product product);
}