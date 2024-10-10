package Refactor;

import java.util.ArrayList;

public class PropertyPortfolio {

    ArrayList<Property> propertyPortfolio = new ArrayList<>();

    public ArrayList<Property> getPropertyPortfolio() {
        return propertyPortfolio;
    }

    public void addProperty(Property property) {
        propertyPortfolio.add(property);
    }

    public void removeProperty(int propertyIndex) {
        propertyPortfolio.remove(propertyPortfolio.get(propertyIndex));
    }

    public void displayPropertiesPortfolio() {
        for (int i = 0; i < propertyPortfolio.size(); i++) {
            System.out.println(i + " : " + propertyPortfolio.get(i));
        }
    }
}
