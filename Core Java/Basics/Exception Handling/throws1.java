
class A  
{
    public void m1 () throws Exception
    {
        int j=5/0;
        System.out.println(j);
    }
    
} 


public class throws1 
{
    public static void main(String[] args)
    {
        try
        {
            A a=new A();
            a.m1();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception caught");
        }
    }
}
