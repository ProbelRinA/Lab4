package Accessability;

public class ExampleCheck2
{
    public static void main(String[] args)
    {
        ExampleCheck.defaultMethod(); //Default konstruktor działa w tej klasie
        ExampleCheck.publicMethod();  //Public konstruktor działa w tej klasie
        //ExampleCheck.privateMehtod(); //Private konstruktor nie działa w tej klasie
        ExampleCheck.protectedMethod(); //Protected konstruktor działa w tej klasie

        System.out.println(ExampleCheck.defaultField); //Default metoda działa w tej klasie
        System.out.println(ExampleCheck.publicField); //Public metoda działa w tej klasie
        //System.out.println(ExampleCheck.privateField); //Private metoda nie działa w tej klasie
        System.out.println(ExampleCheck.protectedField); //Protected metoda działa w tej klasie
    }
}
