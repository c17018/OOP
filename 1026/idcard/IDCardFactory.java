package idcard;

import framework.Factory;
import framework.Product;
import java.util.List;
import java.util.ArrayList;

public class IDCardFactory extends Factory
{
    private List<String> owners = new ArrayList<String>();
    private List<Integer> nos = new ArrayList<Integer>();

    @Override
    protected Product createProduct(String owner, int no)
    {
        return new IDCard(owner, no);
    }

    @Override
    protected void registerProduct(Product product)
    {
        owners.add(((IDCard) product).getOwner());
        nos.add(((IDCard) product).getNo());
    }

    public List<String> getOwners()
    {
        return owners;
    }

    public List<Integer> getNos()
    {
        return nos;
    }
}