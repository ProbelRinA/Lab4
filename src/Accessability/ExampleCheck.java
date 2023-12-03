package Accessability;

public class ExampleCheck
{
    //Default tylko w obrębie tego samego pakietu
    static String defaultField = "Default Field";
    static void defaultMethod()
    {
        System.out.println("Default Method");
    }

    //Public jest widoczne z każdej klasy
    public static String publicField = "Public Field";

    public static void publicMethod()
    {
        System.out.println("Public Method");
    }

    //Private jest widoczne tylko w aktualnej klasie
    private static String privateField = "Private Field";

    static private void privateMehtod()
    {
        System.out.println("Private Method");
    }

    //Protected jest widoczne tylko w aktualnej klasie i klasach pochodnych
    protected static String protectedField = "Protected Field";

    static protected void protectedMethod()
    {
        System.out.println("Protected Method");
    }
    public static void main(String[] args)
    {
        ExampleCheck.defaultMethod(); //Default konstruktor działa w tej klasie
        ExampleCheck.publicMethod(); //Public konstruktor działa w tej klasie
        ExampleCheck.privateMehtod(); //Private konstruktor działa w tej klasie
        ExampleCheck.protectedMethod(); //Protected konstruktor działa w tej klasie

        System.out.println(defaultField); //Default metoda działa w tej klasie
        System.out.println(publicField); //Public metoda działa w tej klasie
        System.out.println(privateField); //Private metoda działa w tej klasie
        System.out.println(protectedField); //Protected metoda działa w tej klasie
    }
}
