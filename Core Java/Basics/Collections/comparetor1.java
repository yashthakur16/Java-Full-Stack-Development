import java.util.*;

public class comparetor1 
{
    public static void main(String[] args) 
    {


        Comparator<Integer> com=new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10>j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        Comparator<String> comp=new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                if(a.length()>b.length())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }

        };

        List<Integer> arr=new ArrayList<Integer>();

        arr.add(12);
        arr.add(21);
        arr.add(15);
        arr.add(93);
        arr.add(56);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

        Collections.sort(arr, com);

        System.out.println(arr);

        List<String> str=new ArrayList<String>();

        str.add("Shrikunj");
        str.add("Yash");
        str.add("Rohan");
        str.add("Vishrut");
        str.add("Kaushal");
        str.add("Aditya");

        System.out.println(str);

        Collections.sort(str,comp);

        System.out.println(str);
    }    
}
