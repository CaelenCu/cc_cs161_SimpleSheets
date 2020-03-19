//package
package main.java.classes;

public class Address{
    //members
    private int addressId;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private int zip;

    //constructor
    public Address(int addressId, String line1, String line2, String city, String state, int zip){
        setAddressId(addressId);
        setLine1(line1);
        setLine2(line2);
        setCity(city);
        setState(state);
        setZip(zip);
    }   

    //operations (getters and setters)
    public void setAddressId(int addressId){
        this.addressId = addressId;
    }

    public int getAddressId(){
        return addressId;
    }

    public void setLine1(String line1){
        this.line1 = line1;
    }

    public String getLine1(){
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String printAddress(){
        StringBuilder sb = new StringBuilder();
        sb.append(getLine1());
        if(!getLine2().equals("") 
        && getLine2() != null){
            sb.append("\r\n");
            sb.append(getLine2());
        }
        sb.append("\r\n");
        sb.append(getCity() + " "
        + getState() + ", " + getZip());

        return sb.toString();
    }
}