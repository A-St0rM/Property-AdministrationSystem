public class Car {

    String brand;
    String model;
    int year;
    String type;

    Car(String brand, String model, int year, String type){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString(){
        return "brand: " + brand + " model: " + model + " year: " + year + " type: " + type;
    }
}