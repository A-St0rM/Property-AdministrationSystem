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
            System.out.println("Here is the list over your properties");
        }

        if(propertyPortfolio.getListOfAllProperties().size() == 0) {
            System.out.println("There is currently no property in your portfolio");
        }
        else if(propertyPortfolio.getListOfAllProperties().size() > 0) {
            propertyPortfolio.getListOfAllProperties();
        }

        System.out.println("Would you like to add a property to the list? Or add a tenant to a property");
        System.out.println("3: Add a property");
        System.out.println("4: Add a tenant to a property");

        if (choice == 3) {
            System.out.println("Which one would you like to add?");
            System.out.println("1: apartment");
            System.out.println("2: TerracedHouse");
            System.out.println("2: Villa");
            int input = scanner.nextInt();
            if(input == 1) {


            }



        }
        else if (choice == 4) {
            System.out.println("Which property would you like to add a tenant?");
            propertyPortfolio.displayAllProperties();
            int input = scanner.nextInt();
            propertyPortfolio.getListOfAllProperties().get(input).setTenant(tenant1);
        }
    }

    public static void createApartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the address of the apartment: ");
        String address = input.nextLine();
        System.out.print("Enter the area of the apartment: ");
        double area = input.nextDouble();
        System.out.print("Enter the value of the apartment: ");
        double value = input.nextDouble();
        System.out.print("Enter the debt: ");
        double debt = input.nextDouble();
        System.out.print("which tenant would  ");

        Apartment apartment = new Apartment(address, area, value, debt, Tenant tenant);
    }

}


