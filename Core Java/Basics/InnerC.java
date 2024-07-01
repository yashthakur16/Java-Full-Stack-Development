class A
{
    int num=5;
    
    public void show()
    {
        System.out.println("In Show");
    }

    static class B
    {
        public void display()
        {
            System.out.println("In Display");
        }
    }
}



public class InnerC 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        A.B obj2 = new A.B();
        obj2.display();
        }    
}
