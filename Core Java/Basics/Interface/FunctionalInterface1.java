//package Interface;


@FunctionalInterface

interface A
{
    void show();
}

interface B 
{
    int add(int i,int j);
}

public class FunctionalInterface1
{
    public static void main(String[] args)
    {
        A obj =new A()
        {
            public void show()
            {
                System.out.println("Hello World");
            }
        };

        obj.show();

        //using lambda (->)

        A obj1 =() -> System.out.println("In show");

        obj1.show();

        B obj3 =(i,j) -> i+j;

        System.out.println(obj3.add(6,7));
    }
    
}
