//package
package main.java.classes;

//imports
import java.util.ArrayList;
import java.util.Date;

public class Order{
    //members
    private Date date;
    private Customer customer;
    private Employee employee;
    private String orderStatus;
    private int number;
    private String customerName;
    private int customerNumber;
    private String employeeName;
    private Address billingAddress;
    private Address shippingAddress;
    private double total;
    private ArrayList<LineItem> lineItems;
    private double commission;

    //constructor
    public Order(int number, Customer customer, Employee employee, ArrayList<LineItem> lineItems){
        Date date = new Date();
        setNumber(number);
        setDate(date);
        setCustomer(customer);
        setEmployee(employee);
        setCustomerNumber(customer.getId());
        setCustomerName(customer.getFullName());
        setBillingAddress(customer.getBillingAddress());
        setShippingAddress(customer.getShippingAddress());
        setEmployeeName(employee.getFullName());
        setLineItems(lineItems);
        calcTotal();
        calcCommission();        
    }
    //operations (getters and setters)

    //Order information
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }
    /* updates the quantitiy of a product that is available after
    assigning the line items to the order */
    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
        for(LineItem item : lineItems){    
            item.getProduct().updateQuantityAvailable(item.getQuantity());
        }
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    /* returns an empty string if the order status is null to prevent confusion.
    This prevents the order from printing out "null" as an order status */
    public String getOrderStatus() {
        if(orderStatus == null){
            return "";
        }
       else{
           return orderStatus;
       }
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    //order calculation(s)
    public void calcTotal(){
        for(LineItem lineItem : getLineItems()){ 
            setTotal(getTotal() + lineItem.getTotal());
        }
    }
        public void calcCommission(){
            setCommission(getTotal() * getEmployee().getCommissionRate());
    }

    //print all order information
    public void printOrder(){
        StringBuilder sb = new StringBuilder();
                sb.append("\r\n"+"Order Number: "+getNumber());
                sb.append("\r\n"+"Order Date: "+getDate());
                sb.append("\r\n"+"Customer Number: "+getCustomerNumber());
                sb.append("\r\n"+"\r\n"+"Employee Name: "+getEmployeeName());
                sb.append("\r\n"+"Customer Name: "+getCustomerName());
                sb.append("\r\n"+"Order Status: "+ getOrderStatus());
                sb.append("\r\n"+"\r\n"+"Billing Address: "+getBillingAddress().printAddress());
                sb.append("\r\n"+"Shipping Address: "+getShippingAddress().printAddress());
                sb.append("\r\n"+"\r\n"+"Ordered Products: ");
                    //loop through each line item
                    for(LineItem lineItem : getLineItems()){
                        sb.append("\r\n"+"\r\n"+"Product: "+lineItem.getProduct().getName());
                        sb.append("\r\n"+"Amount: "+lineItem.getQuantity());
                        sb.append("\r\n"+"Price per unit: "+String.format("%.2f", lineItem.getProduct().getPrice()));
                        sb.append("\r\n"+"Sub Total: "+String.format("%.2f", lineItem.getTotal()));
                        sb.append("\r\n");
                    }
                            sb.append("\r\n"+"Order Total: "+ String.format("%.2f", getTotal()));

        System.out.println(sb.toString());
    }
}   
        

    
  

