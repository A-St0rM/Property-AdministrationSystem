package Refactor;

import java.util.ArrayList;
import java.util.Scanner;

public final class MenuOptions {

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        PropertyPortfolio portfolio = new PropertyPortfolio();

        boolean state = true;

        while(state)
        {
            System.out.println("Welcome!");
            System.out.println(" 1: Property Portfolio");
            System.out.println(" 2: Available  property");
            System.out.println(" 3: Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (!portfolio.getPropertyPortfolio().isEmpty())
                    System.out.println("Here is the list over your properties");
                portfolio.displayPropertiesPortfolio();
            }

            if(choice == 2)
                if(portfolio.getPropertyPortfolio().isEmpty()){
                System.out.println("You have currently no properties");
            }

            System.out.println("Would you like to add/remove a property to the list?");
            System.out.println("3: Add a property");
            System.out.println("4: Remove a property");
            int choice2 = scanner.nextInt();

            if (choice2 == 3) {
                System.out.println("Which one would you like to add?");
                System.out.println("1: apartment");
                System.out.println("2: TerracedHouse");
                System.out.println("3: Villa");
                int input = scanner.nextInt();

                if(input == 1) {
                    portfolio.addProperty(setProperty(PropertyType.APARTMENT));
                }
                else if(input == 2) {
                    portfolio.addProperty(setProperty(PropertyType.TERRACEDHOUSE));
                }
                else if (input == 3) {
                    portfolio.addProperty(setProperty(PropertyType.VILLA));
                }

            }
            else if (choice2 == 4) {
                System.out.println("Which property would you like remove?");
                portfolio.displayPropertiesPortfolio();

                int removeInput = scanner.nextInt();
                portfolio.removeProperty(removeInput);
            }

            if(choice == 3) {
                state = false;
                System.exit(0);
            }
        }

    }

    public static Property setProperty(PropertyType type){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the address of the property?");
        String address = scanner.nextLine();

        System.out.println("What is the area of the property?");
        double area = scanner.nextDouble();

        System.out.println("What is the value of the property?");
        double value = scanner.nextDouble();

        System.out.println("What is the rent of the property?");
        double rent = scanner.nextDouble();

        Property p = new Property(address, area, value, rent, type );

        return p;

    }



}


