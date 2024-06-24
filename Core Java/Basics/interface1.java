interface Computer
{
    public void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run on Laptop");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run on desktop");
    }
}

class Developer
{
    public void devApp(Computer obj)
    {
        obj.code();
    }
}







public class interface1 
{
    public static void main(String[] args) 
    {
        Developer yash=new Developer();
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        yash.devApp(desk);
        yash.devApp(lap);
    }    
}
