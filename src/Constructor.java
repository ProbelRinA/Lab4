public class Constructor
{
    private String name;
    private String specialization;
    private int HP;

    public Constructor (String name, String specialization, int HP)
    {
        this.name=name;
        this.specialization=specialization;
        this.HP=HP;
    }

    public void printInfo()
    {
        System.out.println("Character: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("HP: " + HP);
    }

    public static void main(String[] args)
    {
        Constructor CharacterOne = new Constructor("Publicio", "Healer", 405);
        CharacterOne.printInfo();
        Constructor CharacterTwo = new Constructor("Alexa", "DPS", 520);
        CharacterTwo.printInfo();
    }
}
