/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
        
        signUpManager.signUp(new User(1,"Burak",18));
        
    }
    
}
