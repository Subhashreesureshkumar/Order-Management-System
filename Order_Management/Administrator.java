/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_Management;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SUBHAHARINI
 */
public class Administrator {
    
    static int order_id=1;
    Customer c;
    Manufacturer m;
    Scanner obj=new Scanner(System.in);
    public void manage_orders(String product)
    {
        HashMap<Integer,String> cus_order=new HashMap<>();
        cus_order.put(order_id, product);
        order_id++;
        
    }
    
    public void make_payments(String Manufacturer,double price)
    {
        HashMap<String,Double> man_payments=new HashMap<>();
        man_payments.put(Manufacturer,price);
        m.receive_payments(price);
    }
    
    public void update_customer()
    {
        
        String name=obj.next();
        Customer.customer.put(c.id,name);
    }
     public void delete_customer()
     {
         
        String name=obj.next();
        Customer.customer.remove(c.id,name);
     }
}
