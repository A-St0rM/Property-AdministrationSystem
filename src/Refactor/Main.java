package Refactor;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DbFunctions db = new DbFunctions();

        Connection connection = db.connectToDb("PropertyManager","postgres","Ahlam1982");
        db.createTable(connection,"property");
        //MenuOptions.displayMainMenu();



    }

}


