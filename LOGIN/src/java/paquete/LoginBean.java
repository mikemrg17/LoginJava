package paquete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

class LoginBean 
{
    private HashMap validUsers = new HashMap();

    /**
     * Constructor for LoginBean
     * Initializes the list of usernames/passwords
     */
    public LoginBean()
    {
            validUsers.put("ruben","rpv");
            validUsers.put("administrator","admin");
    }

    public boolean validateUser(String userName, String password)
    {
            if(validUsers.containsKey(userName))
            {
             String thePassword = (String)validUsers.get(userName);
             if(thePassword.equals(password))
             return true;
            }
        return false;
    }
}
