package services;

import java.util.ArrayList;
import java.util.List;
import models.Iphone;
import repo.IphoneREPOSIT;

public class iphoneTransactions  extends IphoneServices {

    private IphoneREPOSIT productRepo = new IphoneREPOSIT();
    
    private List<Iphone> products = new ArrayList<>();
    private List<Iphone> sales = new ArrayList<>();
    private List<Iphone> purcahses = new ArrayList<>();

    public iphoneTransactions(int id, String name, int quantity, double sellPrice, double purchasePrice) {
        super(id, name, quantity, sellPrice, purchasePrice);
    }
        
    
    public iphoneTransactions(){
        super();
        loadProducts();
    }
 
    public iphoneTransactions(String reporting){
        super();
        loadProducts();
        loadSales();
        loadPurchases();
    }

    public void setProducts(List<Iphone> products) {
        this.products = products;
    }
    
    public List<Iphone> getProducts(){
        return products;
    }
    
    @Override
    public void loadProducts(){
        products =  productRepo.getProducts();
    }
    
    @Override
    public void deleteProduct(int id) {
        
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                products.remove(i);
                break;
            }
        }
        productRepo.deleteProduct(getId());
    }
    
    @Override
    public void sellProduct(Iphone p , int qt, double price){
        //update in memory product quantity 
        p.setQuantity(p.getQuantity() - qt);
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == p.getId()){
                products.set(i, p);
                break;
            }
        }
        
        //update in file product quantity
        productRepo.updateProductQuantity(p);
        
        //add product sell entry to file
        productRepo.sellProduct(new Iphone(p.getId(),p.getName(),qt,price,p.getPurchasePrice()));
    }
        
    @Override
    public void purchaseProduct(Iphone p , int qt, double price){
        //update in memory product quantity 
        p.setQuantity((p.getQuantity() + qt));
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == p.getId()){
                products.set(i, p);
                break;
            }
        }
        //update in file product quantity
        productRepo.updateProductQuantity(p);
        
        //add product sell entry to file
        productRepo.purchaseProduct(new Iphone(p.getId(),p.getName(),qt,p.getSellPrice(),price));
    }

    @Override
    public void addProduct(Iphone p) {
        products.add(p);
        productRepo.addProduct(p);
    }

    @Override
    public void updateProduct(Iphone p)  {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == p.getId()){
                products.set(i, p);
                break;
            }
        }
        productRepo.updateProduct(p);
    }

    @Override
    void loadSales() {
        sales = productRepo.getTransactions("sale");
    }

    @Override
    void loadPurchases() {
        purcahses = productRepo.getTransactions("purchase");
    }

    public List<Iphone> getSales() {
        return sales;
    }

    public List<Iphone> getPurcahses() {
        return purcahses;
    }
    
    
    
    
    

}
