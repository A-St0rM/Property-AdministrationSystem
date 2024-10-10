package Refactor;

import java.util.ArrayList;

public class WaitingList {

    Property property;
    Tenant tenant;

    ArrayList<Tenant> waitingList = new ArrayList<>();

    public ArrayList<Tenant> getWaitingList(){
        return waitingList;
    }

    public void setWaitingList(ArrayList<Tenant> waitingList){
        this.waitingList = waitingList;
    }

    public void addTenantToWaitingList(Property property){
        if(property.getTenant() != null){
            System.out.println("This property has already an tenant. You will be added to the waiting list, and will be notified as soon as there is a property available");
            property.setTenant();
            waitingList.add(tenant);
        }
        else{
            System.out.println("The property is available. You will be added");
            property.setTenant();
        }
    }

}
