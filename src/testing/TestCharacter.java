package testing;
import myapp.MyCharacter;

public class TestCharacter
{
    public static void main(String[] args)
    {
        //Tworzymy i wyświetlamy nowy obiekt z pomocą konstruktora i metody Print innej klasy
        MyCharacter Osoba = new MyCharacter("Astolf", "Tank", "Dwarf", 100);
        Osoba.Print();
    }
}
