//package
package main.java.classes;

public class LineItem{
    //members
    private Product product;
    private int quantity;
    private double total;


    //constructor
    public LineItem(Product p, int quantity){
        setProduct(p);
        setQuantity(quantity);
        calcTotal();

    }

    //operations (getters and setters)

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    //calculation(s)
    public void calcTotal(){
        setTotal(getProduct().getPrice() * getQuantity());
    }
}