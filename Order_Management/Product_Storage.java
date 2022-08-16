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
public class Product_Storage {

    public static void add()
    {
        // TODO code application logic here
       Product.prod_price.put("Chudi",800.00);
       Product.prod_price.put("Jeans",800.00);
       Product.prod_price.put("Kurti",800.00);
       Product.prod_price.put("Shirts",800.00);
       Product.prod_price.put("Sarees",800.00);
        
       Product.prod_quantity.put("Chudi", 4);
       Product.prod_quantity.put("Jeans", 4);
       Product.prod_quantity.put("Kurti", 4);
       Product.prod_quantity.put("Shirts", 4);
       Product.prod_quantity.put("Sarees", 4);
    }
    
}
