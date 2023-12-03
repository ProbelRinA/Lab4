package mycar;

public class Car
{
    private String CarBrand;
    private String CarModel;
    private double CarEngineDisplacement;

    public Car(String CarBrand, String CarModel, double CarEngineDisplacement)
    {
        this.CarBrand=CarBrand;
        this.CarModel=CarModel;
        this.CarEngineDisplacement=CarEngineDisplacement;
    }

    public void Print()
    {
        System.out.println("Brand: "+ CarBrand + "\nModel: " + CarModel + "\nEngine Displacement: " + CarEngineDisplacement + " liters");
    }
}
