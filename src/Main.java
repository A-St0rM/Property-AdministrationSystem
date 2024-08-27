import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Tesla","y",2022,"stationcar");
        Car car2 = new Car("BMW","sport",2023,"coupe");
        Car car3 = new Car("Mustang","GT",2020,"Sedan");
        Car car4 = new Car("Dogder","challenger",2020,"coupe");

        ArrayList<Car> carlist = new ArrayList<>();

        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);

        ShowCars(carlist);

    }
    public static void ShowCars(ArrayList<Car> carList){

        for(Car Car : carList){
            System.out.println(Car);
        }

    }
}