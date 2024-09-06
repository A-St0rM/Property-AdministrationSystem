public class Tenant {

    private String name;
    private String cprNumber;
    private String email;

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
}
