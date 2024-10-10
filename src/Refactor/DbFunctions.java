package Refactor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbFunctions {

    public Connection connectToDb(String PropertyManager, String user, String password) {
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:2980/"+ PropertyManager, user, password);
            if(connection!=null){
                System.out.println("Connected to database");
            }
            else{
                System.out.println("Failed to connect to database");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public void createTable(Connection connection, String tableName){
        Statement statement;
        try{

            String query = "create table " + tableName +"(

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
