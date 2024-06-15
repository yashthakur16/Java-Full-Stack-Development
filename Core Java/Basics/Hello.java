
class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        byte b=12;
        int i=257;

       b=(byte)i;

       System.out.println(b);

       System.out.println(6<7);

       char n='4';

       switch (n) {
        case  '1':

        System.out.println("Monday");
        break;
        case '2':

        System.out.println("Tuesday");
        break;
        case '3':

        System.out.println("Wednesday");
        break;
        case '4':

        System.out.println("Thursday");
        break;

        case '5':

        System.out.println("Friday");
        break;
        
        case '6':

        System.out.println("Saturday");
        break;
        
        case '7':

        System.out.println("Sunday");
            
            break;
       
        default:

        System.out.println("Wrong choice");
            break;
       }

    }

}