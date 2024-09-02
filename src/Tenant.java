public class Tenant {

    String name;
    String cprNumber;
    String email;

    public Tenant(String name, String cprNumber, String email) {
        this.name = name;
        this.cprNumber = cprNumber;
        this.email = email;
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
}
