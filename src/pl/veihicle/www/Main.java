package pl.veihicle.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car(2.0, 260, "Audi", 2006, 35000, 180000);
        Car car2 = new Car(1.8, 240, "Opel", 2011, 40000, 55000);
        Car car3 = new Car(1.2, 240, "Nissan", 2015, 38000, 67000);

        //car1
        //informacja na temat wieku samochodu
        System.out.println("Enter to this year: ");
        double thisYear = scanner.nextDouble();
        double yearsold = thisYear - car1.howOldIs(2006);
        System.out.println("Car1 is: " + yearsold + " years old");

        //informacja na temat marki

        System.out.println("Car is mark: " + car1.getName());

        //informacja na temat ceny
        System.out.println("Price brutto is: " + (int) car1.getPriceBruttoVat() + " zł");
        System.out.println("Price netto is: " + (int) car1.getPriceNetto() + " zł");

        //informacja na temat prędkości
        System.out.println("Speed max is: " + car1.getSpeedMax() + " km/h");

        System.out.println("Mileage this car is: " + car1.getMileage() + " km");

    }
}
