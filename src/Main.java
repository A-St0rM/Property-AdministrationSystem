import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PropertyPortfolio portfolio = new PropertyPortfolio();
        Apartment apartment = new Apartment("Islev have 10", 70, 1.3, 0, new Tenant("Alissa", "140505", "Alissaalidib@hotmail.com"));
        Tenant tenant;

        System.out.println("Welcome!");
        System.out.println(" 1: Property Portfolio");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("Here is the list over your properties");
            portfolio.getListOfAllProperties();

            System.out.println("Would you like to add/remove a property to the list?");
            System.out.println("1: Remove a property");
            System.out.println("2: Add a property");

            if(choice == 1){
                System.out.println("Which one would you like to add?");
                System.out.println("1: apartment " + apartment);
                System.out.println("2: Villa " + apartment);
                portfolio.addProperty(apartment);
            }
            else if(choice == 2){
                portfolio.removeProperty(apartment);
            }
        }



        }

    }
