package models;

public class Iphone {
    
    private int id;
    private String name;
    private int quantity;
    private double sellPrice;
    private double purchasePrice;

    public Iphone()
    {
    }

    public Iphone(int id, String name, int quantity, double sellPrice, double purchasePrice)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
        this.purchasePrice = purchasePrice;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getSellPrice()
    {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice)
    {
        this.sellPrice = sellPrice;
    }

    public double getPurchasePrice()
    {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(quantity);
        sb.append(", ").append(sellPrice);
        sb.append(", ").append(purchasePrice);
        return sb.toString();
    }

}
