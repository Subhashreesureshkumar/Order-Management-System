/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_Management;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author SUBHAHARINI
 */
public class Customer {
    
    static int c_id=1000;
    int id;
    String name;
    String phoneno;
    Customer obj;

    public static HashMap<Integer,String> customer=new HashMap<>();
    Product p;
    Customer(String name,String phoneno)
    {
        this.id=c_id++;
        this.name=name;
        this.phoneno=phoneno;
    }

    public int getId() {
        return id;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
 
    public void createOrder()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the item:");
        String prod_name=obj.next();
       
            if(Product.prod_price.containsKey(prod_name))
            {
             System.out.println("Enter the quantity:");
             int quantity=obj.nextInt();
             p=new Product(prod_name,Product.prod_price.get(prod_name),quantity);
             Product.item_price.put(prod_name,Product.prod_price.get(prod_name));
             System.out.println( Product.item_price);
            }
            else
            {
                System.out.println("Item unavailable.....Choose another item");
            }
        
    }
    public void viewbill()
    {
      
      System.out.println("---------------------Bill--------------------");
      System.out.println("Customer id:"+id+"  "+"Customer Name:"+getName()+"  "+"Phone Number:"+getPhoneno());
      System.out.println("*************************************");
      System.out.println("Items"+"  "+"Quantity"+"  "+"Unit Price"+"  "+"Rate");
      
      for(int i=0;i<Product.item_price.size();i++)
      {
          System.out.print(p.getName()+"  ");
          System.out.print(p.getQuantity()+"         ");
          System.out.print(p.getPrice()+"       ");
          int q=p.getQuantity();
          double pr=p.getPrice();
      
          System.out.print(p.calculate_rate(q,pr));
          Product.prod_quantity.put(p.getName(), p.getQuantity()-q);
        
      }
      System.out.println("Total amount to be paid: "+ p.total());
      System.out.println("*************************************");
    }
    
    public void makePayment()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("Amount to be paid: "+p.total());
        System.out.println("Enter your 4 digit pin to make payment");
        double pin=obj.nextDouble();
        System.out.println("Payment made successfully!!");
        System.out.println("Thank you!!visit again!!");
        System.out.println("*************************************");
    }
}
