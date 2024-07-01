class A
{
    public void show()
    {
        System.out.println("In class A");

    }
    public void hide()
    {
        System.out.println("In class A hide");
    }
}

abstract class B
{
    public abstract void show();
}


public class anonymous 
{
    public static void main(String[] args)
    {
        A obj2=new A();
        A obj = new A()
        {
            public void show() 
            {
                System.out.println("In new class");
            }
        };

        obj.show();
        obj.hide();
        obj2.show();

        B obj3 = new B()
        {
            public void show()
            {
                System.out.println("In new class B");
            }
        };

        obj3.show();


    }    
}
