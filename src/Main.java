import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PropertyPortfolio propertyPortfolio = new PropertyPortfolio();
        Tenant tenant1 = new Tenant("Alissa", "140505", "Alissaalidib@hotmail.com");
        Apartment apartment1 = new Apartment("Islev have 10", 70, 1.3, 0, tenant1);


        System.out.println("Welcome!");
        System.out.println(" 1: Property Portfolio");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Here is the list over your properties");
            propertyPortfolio.getListOfAllProperties();

            System.out.println("Would you like to add/remove a property to the list?");
            System.out.println("1: Remove a property");
            System.out.println("2: Add a property");

            if (choice == 1) {
                System.out.println("Which one would you like to add?");
                System.out.println("1: apartment " + apartment1.toString());
                System.out.println("2: Villa ");
//                propertyPortfolio.addProperty(apartment);
//            } else if (choice == 2) {
//                for (Property property1 : property.listOfAllProperties) ;
//                {
//                    System.out.println(property);
//                }
            }
        }


    }

    }
