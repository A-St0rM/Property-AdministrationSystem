public class Apartment {
    private String address;
    private double area;
    private double value;
    private double debt;
    private Tenant tenant;


    public Apartment() {
        this.getAddress();
        this.getArea();
        this.getValue();
        this.getDebt();
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getValue() {
        return value;
    }

    public double getDebt() {
        return debt;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String ToString() {
        return address + "\t" + area + "\t" + value + "\t" + debt + "\t" + tenant;
    }



}
