package pl.veihicle.www;

public class Car {
    //pola statyczne - klast (atrybuty klasy);
    public static double amountOfDoor;
    public static double priceBruttoVat = 0.23;

    //pola egzemplarza;
    private double motor;
    private double speedMax;
    private String mark;
    private double yearOfProduction;
    private double priceNetto;
    private double mileage;

    //konstruktor;
    public Car(double mot, double sM, String m, double yearP, double pN, double ml){
        this.motor = mot;
        this.speedMax = sM;
        this.mark = m;
        this.yearOfProduction = yearP;
        this.priceNetto = pN;
        this.mileage = ml;
    }

    //metoda statyczna - klasy;
    public static boolean is5PersonCar(int amountOfDoor){
        if(amountOfDoor>3);
        return true;
    }

    //metody egzemplarza;
    public double howOldIs(double year){
        return yearOfProduction;
    }
    private double getMileage(){
        return mileage;
    }

}
