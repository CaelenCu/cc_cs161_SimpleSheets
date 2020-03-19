//package
package main.java.classes;

public class Product{
    //members
    private String name;
    private double price;
    private int quantityAvailable;
    private int productId;

    //constructor
    public Product(int productId, String name, double price, int quantityAvailable){
        setProductId(productId);
        setName(name);
        setPrice(price);
        setQuantityAvailable(quantityAvailable);

    }
    //opertaions (getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    //update method(s)
    public void updateQuantityAvailable(int bought){
        if(getQuantityAvailable() - bought < 0){
            System.out.println("Cannot purchase more items than are available"
            + "\r\n" + getQuantityAvailable() + " " + getName() + " Currently available.");
            return;
        }
        else{
        setQuantityAvailable(getQuantityAvailable() - bought);
        }
    }

    public void addQuantityAvailable(int order){
        setQuantityAvailable(getQuantityAvailable() + order);
    }
    
}