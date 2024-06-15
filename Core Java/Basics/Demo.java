class cal
{
    int num1=0;
    int num2=6;
    
    public int add(int num1, int num2)
    {
        return this.num1+this.num2;
    }
}


public class Demo 
{
    public static void main(String[] args)
    {
        cal o=new cal();
        System.out.println(o.add(4,5));

    }    
}
