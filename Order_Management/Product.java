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
public class Product {
    String name;
    double price;
    int quantity;
  static HashMap<String,Double> prod_price=new HashMap<>();
  static  HashMap<String,Integer> prod_quantity=new HashMap<>();
  static  HashMap<String,Double> item_price=new HashMap<>();
    Manufacturer m=new Manufacturer();
    Product p;
    Product(String name,double price,int quantity)
    {
     
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        
        
    }

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
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double calculate_rate(int quantity,double price)
    {
        double rate=0;
        if(quantity<= prod_quantity.get(name))
        {
        rate=quantity*price;
       
        }
        else
        {
            m.order(quantity); // Stock is not available , so placing order to manufacturer
            rate=quantity*price;
           
        }
        item_price.put(name,rate);
        return rate;
    }
     
    public double total()
    {
        double total=0;
        for(int i=0;i<item_price.size();i++)
        {
            
            total+=item_price.get(name);
        }
        return total;
    }
    
    
    
}
