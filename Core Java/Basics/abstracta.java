abstract class A
{
    public abstract void show();
    public abstract void hide();
}

abstract class B extends A
{
    public void show()
    {
        System.out.println("Showing B");
    }

}

class C extends A
{
    public void hide()
    {
        System.out.println("Hiding C");
    } 
    public void show()
    {
        System.out.println("Showing C");    
    }
}

public class abstracta 
{
    public static void main(String[] args) 
    {
        A obj=new C();

        obj.hide();
    }    
}
