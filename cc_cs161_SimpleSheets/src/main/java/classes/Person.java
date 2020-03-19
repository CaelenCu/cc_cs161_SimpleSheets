//package
package main.java.classes;

public abstract class Person{
    //members
    private String fName;
    private String lName;
    private int id;
    private String phoneNumber;
    private String email;
    private Address mailingAddress;


    //operations (getters and setters)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFullName(){
        return fName + " " + lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        if(String.valueOf(phoneNumber).length() < 10 || String.valueOf(phoneNumber).length() > 10){
            System.out.println("Phone number does not exist");
            return null;
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(String.valueOf(phoneNumber).length() < 10){
            System.out.println("Phone number is too short.");
            return;
        }
        else if(String.valueOf(phoneNumber).length() > 10){
            System.out.println("Phone number is too long.");
        }
        else{
            this.phoneNumber = phoneNumber;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}