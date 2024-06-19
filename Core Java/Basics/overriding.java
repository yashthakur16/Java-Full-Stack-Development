class A 
{
    public int add(int a, int b)
    {
        return a + b;
    }
}

class B extends A
{
    public int add(int a, int b)
    {
        return a + b + 1; // overriding the method
    }
}



public class overriding 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        System.out.println(obj.add(5,6));    
    }    
}
