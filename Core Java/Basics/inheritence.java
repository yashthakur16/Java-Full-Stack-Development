//Super class always extend the objects

class A
{
    public A() 
    {
        System.out.println("In A Default");
    }
    public A(int a) 
    {
        this();
        System.out.println("In A parameterized");
    }

}

class B extends A
{
    public B() 
    {
        // super(): calls the super class 
        super(6);
        System.out.println("In B Default");
    }
    public B(int a)
    {
        // this(): calls the object of the same class
        this();
  
        System.out.println("In B parameterized");
    } 
}



public class inheritence 
{
    public static void main(String[] args) 
    {
        B obj = new B(34);
       
    }    
}
