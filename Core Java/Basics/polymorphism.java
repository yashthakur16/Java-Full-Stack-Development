class A
{
    public void show()
    {
        System.out.println("Hello from A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("Hello from B");

    }
}


class C extends A
{
    public void show()
    {
        System.out.println("Hello from C");

    }
    public void show1()
    {
        System.out.println("Hello from C1");
    }
}


public class polymorphism 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        C obj1=new C();
        obj1.show();
        obj1.show1();
    }    
}
