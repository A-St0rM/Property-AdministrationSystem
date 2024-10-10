package Refactor;

import java.util.ArrayList;

public class Tenant {

    private String name;
    private int cprNumber;
    private String email;

    public Tenant() {

    }

    public Tenant(String name, int cprNumber, String email) {
        this.setName(name);
        this.setCprNumber(cprNumber);
        this.setEmail(email);
    }


    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getCprNumber() {
        return cprNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCprNumber(int cprNumber) {
        this.cprNumber = cprNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString(){ // Returns a string that represents an object

        return name + " " + cprNumber + " " + email;
    }

    public void addTenants(Tenant tenant){
        ArrayList<Tenant> tenants = new ArrayList<>();

        tenants.add(tenant);

    }
}
