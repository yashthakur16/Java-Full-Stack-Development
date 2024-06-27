public class calcM 
{
    public static void main(String[] args) {
        
        calc c=new calc();

    int result=c.divide(10,2);

    if(result==5)
    {
        System.out.println("Test case passed");
    }
    else
    {
        System.out.println("Test case failed");
    }
    
    int result2=c.divide(10,5);

    if(result==2)
    {
        System.out.println("Test case passed");
    }
    else
    {
        System.out.println("Test case failed");
    }
    }
    
}
