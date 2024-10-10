package Refactor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Property {

    private long id;
    private String address;
    private double area;
    private double value;
    private double rentalPrice;
    private Tenant tenant;
    private PropertyType propertyType;


    Scanner scanner = new Scanner(System.in);

    public Property(String address,double area,double value,double rentalPrice, PropertyType propertyType) {
        this.address = address;
        this.area = area;
        this.value = value;
        this.rentalPrice = rentalPrice;
        this.propertyType = propertyType;
    }

    public Property(String address,double area,double value,double rentalPrice,Tenant tenant) {
        this.address = address;
        this.area = area;
        this.value = value;
        this.rentalPrice = rentalPrice;
        this.id = id;
        this.tenant = tenant;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress(){
        return address;
    };

    public double getArea(){
        return area;
    };

    public double getValue(){
        return value;
    };

    public double rentalPrice(){
        return rentalPrice;
    };

    public Tenant getTenant(){
        return tenant;
    };

    public void setAddress(String address){
        this.address = address;
    };

    public void setArea(double area){
        this.area = area;
    };

    public void setValue(double value){
        this.value = value;
    };

    public void setRentalPrice(double rentalPrice){
        this.rentalPrice = rentalPrice;
    };

    public PropertyType getPropertyType(){ return propertyType; }

    public void setTenant(){

        System.out.println("Enter the tenants name" );
        String name = scanner.nextLine();
        System.out.println("Enter the tenants cpr number" );
        int cprNumber = scanner.nextInt();
        System.out.println("Enter the tenants email " );
        String email = scanner.nextLine();

        Tenant t = new Tenant(name, cprNumber, email);
        tenant.addTenants(t);

    };

    public String toString(){
        return  "The address is: " + address + " kv^2: " + area + " Value: " + value + " Rental Price; " + rentalPrice + "kr";
    }

}
