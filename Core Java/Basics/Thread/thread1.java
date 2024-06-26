class A extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
           
                e.printStackTrace();
            }
        }
    }
}





public class thread1
{
    public static void main(String[] args)
    {
        A obj=new A();
        B obj2=new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj2.start();
    }
}