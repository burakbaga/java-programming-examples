/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat6
 */
public class SignUpManager {

    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService =  iUserCheckService;
    }
    
    
    

    public void signUp(User user) {
        if(iUserCheckService.checkUser(user)){
            System.out.println("Kullanıcı kayıt oldu"+user.getName());
        }else {
            System.out.println("Kayıt başarısız..");
        }
        
     
    }


   

}
