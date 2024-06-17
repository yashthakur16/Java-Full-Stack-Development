class human
{
    private String name;
    // private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}


public class encapsulation 
{
    public static void main(String[] args)
    {
        human obj = new human();

        obj.setName("Prince");

        

        human obj1 = new human();

        obj1.setName("Yash");
        
        System.out.println(obj.getName());
        System.out.println(obj1.getName());

    }    
}
