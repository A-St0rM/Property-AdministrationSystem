package Refactor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbFunctions {

    public Connection connectToDb(String PropertyManager, String user, String password) { //Making a method for connecting to database
        Connection connection = null; //Making a connect object
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:2980/"+ PropertyManager, user, password);
            if(connection!=null){ //If database exists then run this code
                System.out.println("Connected to database");
            }
            else{ // Not connected
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

            String query = "create table " + tableName +"(empid SERIAL, name varchar(200), address varchar(200), primary key(empid));";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void insertRow(Connection connection, String tableName, String name, String address){
        Statement statement;
        try{
            String query = "insert into " + name + " values('" + address + "'); " + tableName;
            statement = connection.createStatement();

        }
        catch(Exception e){
            System.out.println("failed to insert row" + e.getMessage());
        }
    }
}
