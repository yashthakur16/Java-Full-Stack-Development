class Phone
{
    String brand;
    int price;
    int rating;
    static String type;

    static
    {
        type = "Smartphone";
    }

    public Phone()
    {
        brand = "Motorola";
        price = 50;
        rating = 3;
    }

    public void show()
    {
        System.out.println("Brand : "+brand+" Price : "+price+" Rating : "+rating+ " Type : "+type);
    }
}





public class mobile
{
    public static void main(String[] args)
    {
        Phone obj1=new Phone();
        Phone obj2=new Phone();

        obj1.show();

        obj1.brand="Samsung";
        obj1.price=20000;
        obj1.rating=4;

        obj2.brand="Apple";
        obj2.price=50000;
        obj2.rating=5;

        // Always call static variable with class name

        // Phone.type="Smart Phone";

        obj1.show();
        obj2.show();


    }
}