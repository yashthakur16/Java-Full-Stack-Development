public class exception1
{
    public static void main(String[] args) 
    {
        int i=2;
        int j=5;
        int result=5;
        int arr[]=new int[5];
        String str=null;
        
        try
        {
            result=j/i;
            System.out.println(arr[3]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits dude");
        }
        catch(Exception e)
        {
            System.out.println("Not possible dude "+ e);
        }

        System.out.println(result);
        System.out.println("bye");

    }
}