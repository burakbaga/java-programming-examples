/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class ProductManager {
    
    private BaseProductDao baseProductDao;
    
    public ProductManager(BaseProductDao baseProductDao){
        this.baseProductDao = baseProductDao;// Buradaya istedimiz sınıfı gönderirirz ORACLE YADA MYSQL
    }
    
    
    
    public void add(Product product){
        
        baseProductDao.add(product);
        System.out.println("Ürün i katmanına eklendi");
        System.out.println("Ürün ismi:"+product.getName());
    }
    
    
}
