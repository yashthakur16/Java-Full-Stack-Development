public class Wrapper 
{
    public static void main(String[] args) 
    {
        // primitive data type
        int a = 10;

        Integer num=a;     //auto-boxing

        int b=num;         //auto-unboxing

        int c=num.intValue();

        String str="50";

        int num2=Integer.parseInt(str);

        System.out.println(num2*2);
    }    
}
