package mycar;

public class TestCar
{
    public static void main(String[] args)
    {
        //Tworzymy obiekty i dodajemy ich do tablicy
        Car[] cars =
        {
            new CarDetail("Toyota", "Camry", 2.5, 30000, 2021),
            new CarDetail("BMW", "X5", 3.0, 60700, 2023),
            new CarDetail("Ford", "Mustang", 5.0, 50550, 2022)
        };

        //wyświetlamy wszyzcy obiekty
        for (Car car : cars)
        {
            car.Print();
            System.out.println(" ");
        }
    }
}
