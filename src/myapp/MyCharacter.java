package myapp;

public class MyCharacter
{
    private String Name;
    private String CharacterClass;
    private String Race;
    private int Strenght;
    public MyCharacter(String Name, String CharacterClass, String Race, int Strenght)
    {
        this.Name=Name;
        this.CharacterClass=CharacterClass;
        this.Race=Race;
        this.Strenght=Strenght;
    }

    public void Print()
    {
        System.out.println("Name:"+ Name + "\nClass: " + CharacterClass + "\nRace: " + Race + "\nStrenght: " + Strenght);
    }

 }
