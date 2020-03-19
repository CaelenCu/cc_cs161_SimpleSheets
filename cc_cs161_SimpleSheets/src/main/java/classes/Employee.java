//package
package main.java.classes;

//imports
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Employee extends Person {
    // members
    private Date hireDate;
    private double salary;
    private double commissionRate;
    private String department;

    // constructor
    public Employee(int id, String fName, String lName, String phoneNumber, String email
        , String hireDate, double salary,
        double commissionRate, String department, Address mailingAddress
        ) 
        //parse exception handles errors when parsing the entered date from String to Date
        throws ParseException {
        setId(id);
        setfName(fName);
        setlName(lName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setHireDate(hireDate);
        setSalary(salary);
        setCommissionRate(commissionRate);
        setDepartment(department);
        setMailingAddress(mailingAddress);
    }

    // operations (getters and setters)
    public Date getHireDate() {
        return hireDate;
    }
    //sets the data type Date from a string input
    public void setHireDate(String hireDate)throws ParseException {
        //creates a format following expected inputs
        SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
        //parses the string into a Date data type
        Date date = formatDate.parse(hireDate); 
        //sets the hireDate to the parsed Date
        this.hireDate = date;
    }
    public void printHireDate(){
        SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatDate.format(getHireDate()));
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commission) {
        this.commissionRate = commission;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    //Print list of commissions
    public void printCommissions(ArrayList<Order> orders){
        StringBuilder sb = new StringBuilder();
        System.out.println("Commission History: ");
        for(Order order : orders){
            if(order.getEmployee().getId() == getId()){
                sb.append("\r\n" + "Order Number: " + order.getNumber());
                sb.append("\r\n" + "Commission Amount: " + String.format("%.2f", order.getCommission()) + "\r\n");
            }
        }
        System.out.println(sb);
    }
}