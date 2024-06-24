class A
{
    public void show(){System.out.println("in A");}
}


class B extends A
{
    public void show2(){System.out.println("in B");}
}


public class casting 
{
    public static void main (String[] args)
    {
        A obj=(A) new B();          //upcasting

        B obj1=(B) obj;            //downcasting
        
        obj1.show2();

    }    
}
