package repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import models.Iphone;

public class IphoneREPOSIT {

    private static final String PRODUCTS_FILE = "products.txt";
    private static final String SALES_FILE = "sales.txt";
    private static final String PURCHASES_FILE = "purchases.txt";
    
    public void addProduct(Iphone p){
        try{
            File inputFile = new File(PRODUCTS_FILE);
            FileWriter writer = new FileWriter(inputFile, true);
            writer.write(p.toString() + System.getProperty("line.separator"));
            writer.close();         
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
     
    public void updateProduct(Iphone p){
        try{
            File inputFile = new File(PRODUCTS_FILE);
            File tempFile = new File("temp"+PRODUCTS_FILE);

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToUpdate = p.getId()+"";
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                if(!currentLine.split(",")[0].equals(lineToUpdate)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
                else{
                    writer.write(p.toString() + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
            if(!successful){
                inputFile.delete();
                successful = tempFile.renameTo(inputFile);
            }         
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
     
    public void deleteProduct(int id){
        try{
            File inputFile = new File(PRODUCTS_FILE);
            File tempFile = new File("temp"+PRODUCTS_FILE);

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = Objects.toString(id,null);
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                if(!currentLine.split(",")[0].equals(lineToRemove)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
            if(!successful){
                inputFile.delete();
                successful = tempFile.renameTo(inputFile);
            }
//    Files.move(new File(fileName).toPath(), new File(fileName).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);            
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
        
    public void sellProduct(Iphone p) {
        try{
            File inputFile = new File(SALES_FILE);
            FileWriter writer = new FileWriter(inputFile, true);
            writer.write(p.toString() + System.getProperty("line.separator"));
            writer.close();         
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
        
    public void purchaseProduct(Iphone p) {
        try{
            File inputFile = new File(PURCHASES_FILE);
            FileWriter writer = new FileWriter(inputFile, true);
            writer.write(p.toString() + System.getProperty("line.separator"));
            writer.close();         
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void updateProductQuantity(Iphone p){
        updateProduct(p);
    }
    
    public List<Iphone> getProducts(){
        List<Iphone> products = new ArrayList<>();
        
        try {
            Scanner scan = new Scanner(new File(PRODUCTS_FILE));
            while (scan.hasNextLine()) {                
                String productLine = scan.nextLine();
                String[] productData = productLine.split(",");
                products.add(new Iphone(
                        Integer.parseInt(productData[0].trim()),
                        productData[1].trim(),
                        Integer.parseInt(productData[2].trim()),
                        Double.parseDouble( productData[3].trim()),
                        Double.parseDouble(productData[4].trim())
                    )
                );
            }
            scan.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return products;
    }
    
    
    public List<Iphone> getTransactions(String trans){
        List<Iphone> products = new ArrayList<>();
        
        try {
            Scanner scan = new Scanner(new File(trans.equals("sale")?SALES_FILE:PURCHASES_FILE));
            while (scan.hasNextLine()) {                
                String productLine = scan.nextLine();
                String[] productData = productLine.split(",");
                products.add(new Iphone(
                        Integer.parseInt(productData[0].trim()),
                        productData[1].trim(),
                        Integer.parseInt(productData[2].trim()),
                        Double.parseDouble( productData[3].trim()),
                        Double.parseDouble(productData[4].trim())
                    )
                );
            }
            scan.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return products;
    }
    
}
