import java.util.ArrayList;
import java.util.Scanner;

public final class MenuOptions {

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        PropertyPortfolio propertyPortfolio = new PropertyPortfolio();
        ArrayList<Tenant> tenants = new ArrayList<>();

        Tenant tenant1 = new Tenant("Alissa", "140505", "Alissaalidib@hotmail.com");
        Tenant tenant2 = new Tenant("Jens", "1407199", "JensSøren@hotmail.com");
        Apartment apartment1 = new Apartment("Islev have 10", 70, 1.3, 0, tenant1);

        tenants.add(tenant1);
        tenants.add(tenant2);

        System.out.println("Welcome!");
        System.out.println(" 1: Property Portfolio");
        System.out.println(" 2: Available  property");
        int choice = scanner.nextInt();

        if (choice == 1) {
            if (propertyPortfolio.getListOfAllProperties().size() > 0)
                System.out.println("Here is the list over your properties");
                propertyPortfolio.displayAllProperties();
        }

        else if(propertyPortfolio.getListOfAllProperties().size() == 0){
            System.out.println("You have currently no properties");
        }


        System.out.println("Would you like to add/remove a property to the list?");
        System.out.println("3: Add a property");
        System.out.println("4: Remove a property");
        scanner.nextInt();

        if (scanner.nextInt() == 3) {
            System.out.println("Which one would you like to add?");
            System.out.println("1: apartment");
            System.out.println("2: TerracedHouse");
            System.out.println("2: Villa");
            scanner.nextInt();

            if(scanner.nextInt() == 1) {

                propertyPortfolio.displayAllProperties();
                propertyPortfolio.addProperty(apartment1);

            }

        }
        else if (choice == 4) {
            System.out.println("Which property would you like remove?");
            propertyPortfolio.displayAllProperties();
            int input = scanner.nextInt();
            propertyPortfolio.getListOfAllProperties().remove(input);
        }
    }



}


