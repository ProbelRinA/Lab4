public class Object implements Cloneable
{
    private String name;
    private String surname;
    private int age;

    public Object(String name, String surname, int age)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    //Przesłonięta metoda toString, zwracająca reprezentację obiektu jako tekst
    public String toString()
    {
       return name + " " + surname + " " + age + " y.o.";
    }

    //Przesłonięta metoda clone z interfejsu Cloneable, umożliwiająca klonowanie obiektu
     @Override
    public Object clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }

    // Metoda finalize, wywoływana przed usunięciem obiektu przez Garbage Collector
    @Override
    protected void finalize() throws Throwable
    {
        try {
            System.out.println("Finalize");
        } finally {
            super.finalize();
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        //Tworzymy obiekt p1 i wypisamy informacji o nim z toString() i bez
        Object p1 = new Object("Roku", "Lina", 14);
        System.out.println(p1);
        System.out.println(p1.toString());

        //Testujemy metode equals()
        String e1 = "1";
        String e2 = "1";
        String e3 = new String("1");

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));

        //Testowanie metode clone()
        Object p2 = new Object("John", "Wasz", 25);
        Object p3 = (Object) p2.clone();

        System.out.println(p3);

        //Testowanie metode finalize()
        Object obj = new Object("Roku", "Lina", 14);
        System.out.println(obj.hashCode());
        System.out.println(e1.hashCode());

        obj = null;
        e1 = null;
        System.gc();
        System.out.println("Garbage Collection");
    }
}
