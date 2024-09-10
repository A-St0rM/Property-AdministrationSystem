public interface Property {

    String getAddress();

    double getArea();

    double getValue();

    double getDebt();

    Tenant getTenant();

    void setAddress(String address);

    void setArea(double area);

    void setValue(double value);

    void setDebt(double debt);

    void setTenant(Tenant tenant);


}
