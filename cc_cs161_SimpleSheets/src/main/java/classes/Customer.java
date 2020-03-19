//package
package main.java.classes;

//imports

public class Customer extends Person{
    //members
    private Address billingAddress;
    private Address shippingAddress;

    //constructor
    public Customer(String fName, String lName, int id, String phoneNumber, String email
    , Address mailingAddress, Address billingAddress
    , Address shippingAddress
    ){
        setfName(fName);
        setlName(lName);
        setId(id);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setMailingAddress(mailingAddress);
        setBillingAddress(billingAddress);
        setShippingAddress(shippingAddress);
    }

    //operations 
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
}