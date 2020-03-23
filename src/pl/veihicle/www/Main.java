package pl.veihicle.www;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(2.0, 260, "Audi", 2006, 35000, 180000);
        Car car2 = new Car(1.8, 240, "Opel", 2011, 40000, 55000);
        Car car3 = new Car(1.2, 240, "Nissan", 2015, 38000, 67000);


        System.out.println(car1.howOldIs(2006));

    }
}
