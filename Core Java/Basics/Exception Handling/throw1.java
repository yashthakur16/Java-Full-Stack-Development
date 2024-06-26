class yashException extends Exception 
{
    public yashException(String message)
    {
        super(message);
    }
}


public class throw1 
{
    public static void main(String[] args) {
        int a=0;
        int j=0;

        try 
        {
            j=0/10;
            if(j==0)
            {
                j=1;
                throw new yashException("zero answer nahi chalega bhai");
                
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught "+ e);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught "+ e);
        }

        System.out.println(j);
    }    

    
}
