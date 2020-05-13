/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class AgeUserCheckService implements IUserCheckService {
    //Method

    public boolean checkUser(User user) {
        if (user.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
