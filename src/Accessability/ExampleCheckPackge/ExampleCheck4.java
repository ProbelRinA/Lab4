package Accessability.ExampleCheckPackge;

import Accessability.ExampleCheck;

public class ExampleCheck4 extends ExampleCheck
{
    public static void main(String[] args)
    {
        //ExampleCheck.defaultMethod(); //Default konstruktor nie działa w tej klasie
        ExampleCheck.publicMethod();  //Public konstruktor działa w tej klasie
        //ExampleCheck.privateMehtod(); //Private konstruktor nie działa w tej klasie
        ExampleCheck.protectedMethod(); //Protected konstruktor działa w tej klasie

        //System.out.println(ExampleCheck.defaultField); //Default metoda nie działa w tej klasie
        System.out.println(ExampleCheck.publicField); //Public metoda działa w tej klasie
        //System.out.println(ExampleCheck.privateField); //Private metoda nie działa w tej klasie
        System.out.println(ExampleCheck.protectedField); //Protected metoda działa w tej klasie
    }
}
