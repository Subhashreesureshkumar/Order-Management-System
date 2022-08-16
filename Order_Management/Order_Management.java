/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_Management;

import java.util.*;
/**
 *
 * @author SUBHAHARINI
 */
public class Order_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product_Storage.add();
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your name:");
        String cust_name=obj.next();
      
        System.out.println("Enter your phone number:");
        String ph=obj.next();
        Customer cus=new Customer(cust_name,ph);
        Customer.customer.put(cus.getId(),cus.getName());
        
        System.out.println("Enter 1 to purchase items...");
        System.out.println("If you want to complete orders enter 2");   
        int user_input=obj.nextInt();
        
        while(user_input==1)
        {
            cus.createOrder();
            user_input=obj.nextInt();
        }
        
        System.out.println("Here is your Bill...");
        cus.viewbill();
       
        System.out.println("Do you want to continue to pay the bill?(yes/no)");
        String input=obj.next();
      
        if(input.equals("yes"))
        {
            cus.makePayment();
        }
   
    }
    
}
