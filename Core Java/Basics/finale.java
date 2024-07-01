class A 
{
    //final keyword is used to stop inheritence of the class and method overriding
    public final void show()
    {
        System.out.println("By Yash");
    }

    public void add()
    {
        System.out.println(6+9);
    }
}

class B extends A
{
    public void add()
    {
        System.out.println("By Yash from B");
    }
}


public class finale 
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.add();
    }    
}
