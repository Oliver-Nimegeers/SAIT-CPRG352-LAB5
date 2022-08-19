package service;

import models.User;

/**
 *
 * @author Oliver
 */
public class AccountService {
    public User login(String username, String password)
    {
        String usernames[] = {"abe", "barb"};
        String pass = "password";
        if ((username.equals(usernames[0]) || username.equals(usernames[1])) && password.equals(pass))
        {
            User realuser = new User(username,null);
            return realuser;
        }
        return null;
    }
}
