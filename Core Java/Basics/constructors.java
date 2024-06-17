class Human
{
    String name;
    int age;

    public Human()
    {
        name="Kaushal";
        age=18;
    }

    public Human(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void show()
    {
        System.out.println("Name: " + name+ " Age: " + age);
    }
}

public class constructors 
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        Human obj2 = new Human("Yash",16);
        obj.show();
        obj2.show();
    }
}
