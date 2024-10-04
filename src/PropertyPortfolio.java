
import java.util.ArrayList;

public class PropertyPortfolio  {

    public PropertyPortfolio() {
        this.listOfAllProperties = new ArrayList(); //HELP
    }

    public ArrayList<Property> listOfAllProperties;

    public void addProperty(Property property){

        listOfAllProperties.add(property);
    }

    public void removeProperty(Property property){

        listOfAllProperties.remove(property);
    }

    public ArrayList<Property> getListOfAllProperties() {
        return listOfAllProperties;
    }

    public void displayAllProperties(){
        for(Property s : listOfAllProperties){
            System.out.println(s);
        }
    }
}
