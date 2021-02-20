/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Thomas Skiffington
 */
public class AccountService {

    public User login(String username, String password) {

        if (password.equals("password") && username.equalsIgnoreCase("Abe")) {
            User user = new User(username, password);
            return user;
        } else if (password.equals("password") && username.equalsIgnoreCase("Barb")) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }

    }
}
