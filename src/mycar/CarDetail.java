package mycar;

//Klasa że jest rozszerzą klasy Car
public class CarDetail extends Car
{
    public int CarPrice;
    public int CarYearOfCreation;

    //Dodajemy nowe parametry
    public CarDetail(String CarBrand, String CarModel, double CarEngineDisplacement, int CarPrice, int CarYearOfCreation)
    {
        super(CarBrand, CarModel, CarEngineDisplacement);
        this.CarPrice=CarPrice;
        this.CarYearOfCreation=CarYearOfCreation;
    }

    //Dodajemy do wyświetlenia
    public void Print()
    {
        super.Print();
        System.out.println("Year of creation: " + CarYearOfCreation + "\nPrice: " + CarPrice + " $");
    }
}
