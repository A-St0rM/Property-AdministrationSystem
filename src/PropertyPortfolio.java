
import java.util.ArrayList;

public class PropertyPortfolio  {

    public PropertyPortfolio() {
        this.listOfAllProperties = new ArrayList(); //HELP
    }

    ArrayList<Property> listOfAllProperties = new ArrayList<Property>();

    void addProperty(Property property){ // Skal jeg have forklaring på

        listOfAllProperties.add(property);
    }

    void removeProperty(Property property){

        listOfAllProperties.remove(property);
    }

    public ArrayList<Property> getListOfAllProperties() {
        return listOfAllProperties;
    }
}
