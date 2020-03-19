//HEADER
//Program Name: Simple Sheets
//Author: Caelen Curtiss
//Class: CS161 Winter Term
//Date: 03/19/2020
//Description: Creates an order for Simple Sheets


//package
package main.java;

//imports
import main.java.classes.Address;
import main.java.classes.Customer;
import main.java.classes.Employee;
import main.java.classes.Product;
import main.java.classes.LineItem;
import main.java.classes.Order;
import java.util.ArrayList;
import java.text.ParseException;

public class Main{
    //main entry point
    public static void main(String[] args)throws ParseException{

        //lists of addresses
        ArrayList<Address> addresses = new ArrayList<>();

        //address Id, First Address, Secondry Address, City, State, Zip
        addresses.add(new Address(1, "123 Employee Street", "", "The Dalles", "Oregon", 97058));
        addresses.add(new Address(2, "456 Employee Street", "", "The Dalles", "Oregon", 97058));
        addresses.add(new Address(3, "789 Employee Street", "", "The Dalles", "Oregon", 97058));
        addresses.add(new Address(4, "123 Main Street", "", "", "Oregon", 97058));
        addresses.add(new Address(5, "123 Not Main Street", "", "The Dalles", "Oregon", 97058));
        addresses.add(new Address(6, "123 Court Street", "", "The Dalles", "Oregon", 97058));

        //create employees
        //employees are created, pulling from their given addresses
        ArrayList<Employee> employees = new ArrayList<>();
        /* Id Number, First Name, Last Name, Phone Number, Email,
        Hire Date, Salary, Commission Rate, Department, Mailing Address */
        employees.add(new Employee(1, "Jane", "Doe", "5417058877", "Jdoe@gmail.com"
        , "08/27/2000", 45000, 0.15, "Sales", addresses.get(0)));
        employees.add(new Employee(2, "John", "Doe", "5417058899", "Jdoe@gmail.com"
        , "12/18/1890", 45000, 0.15, "Sales", addresses.get(1)));

        //customers are created, pulling from their given addresses
        ArrayList<Customer> customers = new ArrayList<>();
       /*  First Name, Last Name, Id Number, Phone Number, Email,
        Mailing Address, Billing Address, Shipping Address */
        customers.add(new Customer("James", "Beck", 1, "5419807724", "Jbeck@hotmail.com"
        , addresses.get(4), addresses.get(4), addresses.get(5)));
        
        //products available within the system
        //Product Id, Product Name, Product Price, Quantity Available
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Hammermill Paper", 31.99, 10));
        products.add(new Product(2, "Tru Red Paper", 55.99, 15));
        products.add(new Product(3, "Domtar Paper", 59.29, 5));
       
        //products to be ordered (list One)
        ArrayList<LineItem> lineItems1 = new ArrayList<>();
        //Product, Number to be Ordered
        lineItems1.add(new LineItem(products.get(0), 1));
        lineItems1.add(new LineItem(products.get(1), 3));
        lineItems1.add(new LineItem(products.get(2), 5));

        //products to be ordered (list Two)
        ArrayList<LineItem> lineItems2 = new ArrayList<>();
        //Product, Number to be Ordered
        lineItems2.add(new LineItem(products.get(0), 4));
        lineItems2.add(new LineItem(products.get(1), 5));
        lineItems2.add(new LineItem(products.get(2), 0));

        //keeps track of all orders in the system
        ArrayList<Order> orders = new ArrayList<>();
        //Creates new orders from available information
        //Order Number, Customer, Employee, Item list to be Ordered
        orders.add(new Order(1, customers.get(0), employees.get(0), lineItems1));
        orders.add(new Order(2, customers.get(0), employees.get(1), lineItems2));
  
        //prints order at position () in the orders array
        for(int i = 0; i < orders.size(); i++){
          orders.get(i).printOrder();
        }

        //prints a specific order from the array
        //orders.get(1).printOrder();

        //shows that addQuantiyAvailable functions properly
        System.out.println(products.get(2).getQuantityAvailable());
        products.get(2).addQuantityAvailable(1);
        System.out.println(products.get(2).getQuantityAvailable()); 
        
        //prints all commissions an employee has recieved
        employees.get(0).printCommissions(orders);
  }
}
/* FOOTER
Order Number: 1
Order Date: Thu Mar 19 16:39:02 PDT 2020
Customer Number: 1

Employee Name: Jane Doe
Customer Name: James Beck
Order Status:

Billing Address: 123 Not Main Street
The Dalles Oregon, 97058
Shipping Address: 123 Court Street
The Dalles Oregon, 97058

Ordered Products:

Product: Hammermill Paper
Amount: 1
Price per unit: 31.99
Sub Total: 31.99


Product: Tru Red Paper
Amount: 3
Price per unit: 55.99
Sub Total: 167.97


Product: Domtar Paper
Amount: 5
Price per unit: 59.29
Sub Total: 296.45

Order Total: 496.41

Order Number: 2
Order Date: Thu Mar 19 16:39:02 PDT 2020
Customer Number: 1

Employee Name: John Doe
Customer Name: James Beck
Order Status:

Billing Address: 123 Not Main Street
The Dalles Oregon, 97058
Shipping Address: 123 Court Street
The Dalles Oregon, 97058

Ordered Products:

Product: Hammermill Paper
Amount: 4
Price per unit: 31.99
Sub Total: 127.96


Product: Tru Red Paper
Amount: 5
Price per unit: 55.99
Sub Total: 279.95


Product: Domtar Paper
Amount: 0
Price per unit: 59.29
Sub Total: 0.00

Order Total: 407.91
0
1
Commission History:

Order Number: 1
Commission Amount: 74.46
*/