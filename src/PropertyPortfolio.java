import java.util.ArrayList;

public class PropertyPortfolio {


    ArrayList<Object> listOfAllProperties = new ArrayList<Object>();

    void addProperty(Object property){

        listOfAllProperties.add(property);
    }

    void removeProperty(Object property){

        listOfAllProperties.remove(property);
    }

    public ArrayList<Object> getListOfAllProperties() {
        return listOfAllProperties;
    }
}
