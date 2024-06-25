enum status
{
    Showing,Hiding,Running,Jumping;
}


public class enum1 
{
    public static void main(String[] args)
    {
        // status s=status.Hiding;
        // System.out.println(s);

        status ss[]=status.values();

        for(status s : ss)
        {
            System.out.println(s+" : "+s.ordinal());
        }

        status c=status.Running;

        switch(c)
        {
            case Showing:
            System.out.println("Showing");
            break;

            case Hiding:
            System.out.println("Hiding");
            break;

            case Running:
            System.out.println("Running");
            break;

            default:
            System.out.println("Jumping");
        }
    }
}
