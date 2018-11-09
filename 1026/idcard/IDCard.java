package idcard;

import framework.Product;

public class IDCard extends Product
{
    private String owner;
    private int no;

    IDCard(String owner, int no)
    {
        System.out.println("No." + Integer.toString(no) + " " +  owner + "のカードを作ります。");
        this.owner = owner;
        this.no = no;
    }

    @Override
    public void use()
    {
        System.out.println("No." + Integer.toString(no) + " " +  owner + "のカードを使いました");
    }

    public String getOwner()
    {
        return owner;
    }

    public int getNo()
    {
        return no;
    }
}