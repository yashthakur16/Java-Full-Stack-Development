interface A
{
    String name="Yash";   //By default static and final
    void show();
    void hide();
}

interface X extends A 
{
    void run();
}

interface Y extends X,A
{
    void jump();
}

class B implements A,X 
{
    public void show()
    {
        System.out.println("Showing");
    }
    public void hide()
    {
        System.out.println("Hiding");
    }
    public void run()
    {
        System.out.println("Running");
    }
}


public class interface2 
{
    public static void main(String[] args)
    {
        System.out.println(A.name);

        X obj=new B ();

        obj.show();
        obj.hide();
        obj.run();
    }   
}
