
public class Apartment implements Property {
    private String address;
    private double area;
    private double value;
    private double debt;
    private Tenant tenant;


    public Apartment(String address, double area, double value, double debt, Tenant tenant) {
        this.setAddress(address);
        this.setArea(area);
        this.setValue(value);
        this.setDebt(debt);
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getDebt() {
        return debt;
    }

    @Override
    public Tenant getTenant() {
        return tenant;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void setDebt(double debt) {
        this.debt = debt;
    }

    @Override
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String ToString() {
        return address + "\t" + area + "\t" + value + "\t" + debt + "\t" + tenant;
    }



}
