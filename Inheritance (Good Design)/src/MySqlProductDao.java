/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class MySqlProductDao extends BaseProductDao{
    
    public MySqlProductDao(String connectionString) {
        super(connectionString);
    }
    @Override
    public void add(Product product){
        
        System.out.println("Mysql Database eklendi");
        System.out.println(product.getName()+" eklendi");
    }
    
    
}
