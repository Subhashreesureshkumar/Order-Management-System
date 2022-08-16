/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_Management;

import java.util.HashMap;

/**
 *
 * @author SUBHAHARINI
 */
public class Manufacturer {
  
    String name;
    String phoneno;
    Product product;
    static HashMap<Product,Double> payments=new HashMap<>();
    static HashMap<Product,Integer> order=new HashMap<>();
    Administrator admin;
   
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
    
    public int order(int quantity)
    {
        order.put(product, quantity);
        return quantity;
    }
    public void receive_payments(double price)
    {
        payments.put(product,price);
        admin.make_payments(name, price);
    }
}
