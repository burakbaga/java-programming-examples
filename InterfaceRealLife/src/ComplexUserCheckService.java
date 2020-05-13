/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class ComplexUserCheckService implements IUserCheckService{
    
    public boolean checkUser(User user){
        return (user.getAge()>=18&user.getName().startsWith("Bu"));
    }
    
    
}
