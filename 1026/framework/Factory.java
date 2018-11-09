package framework;

import java.util.Map;
import java.util.HashMap;

public abstract class Factory
{
    public final Product create(String owner, int no)
    {
        Product p = createProduct(owner, no);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner, int no);

    protected abstract void registerProduct(Product product);
}