import java.util.ArrayList;

public class Tenant {

    private String name;
    private String cprNumber;
    private String email;

    public Tenant() {

    }


    public Tenant(String name, String cprNumber, String email) {
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

    public String getCprNumber() {
        return cprNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCprNumber(String cprNumber) {
        this.cprNumber = cprNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString(){ // Returns a string that represents an object

        return name + " " + cprNumber + " " + email;
    }

    public void addTenants(){
        ArrayList<Tenant> tenants = new ArrayList<>();

        Tenant tenant1 = new Tenant("Alissa", "140505", "Alissaalidib@hotmail.com");
        Tenant tenant2 = new Tenant("Jens", "1407199", "JensSøren@hotmail.com");


        tenants.add(tenant1);
        tenants.add(tenant2);

    }
}
