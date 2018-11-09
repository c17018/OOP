package idcard;

import framework.Factory;
import framework.Product;
import java.util.List;
import java.util.ArrayList;
import java.Map;
import java.HashMap;

public class IDCardFactory extends Factory
{
    // private List<String> owners = new ArrayList<String>();
    private Map<String, String> owners = new HashMap<Staring, String>();

    @Override
    protected Product createProduct(String owner)
    {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product)
    {
        owners.put(((IDCard) product).getOwner());
    }

    public List<String> getOwners()
    {
        return owners;
    }
}