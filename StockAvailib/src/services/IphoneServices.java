package services;

import models.Iphone;

public abstract class IphoneServices extends Iphone {

    public IphoneServices(){
        super();
    }
    
    public IphoneServices(int id, String name, int quantity, double sellPrice, double purchasePrice) {
        super(id, name, quantity, sellPrice, purchasePrice);
    }
    
    abstract void addProduct(Iphone p);
    abstract void updateProduct(Iphone p);
    abstract void deleteProduct(int id);
    abstract void sellProduct(Iphone p , int qt, double price);
    abstract void purchaseProduct(Iphone p , int qt, double price);
    abstract void loadProducts();
    
    abstract void loadSales();
    abstract void loadPurchases();
}
