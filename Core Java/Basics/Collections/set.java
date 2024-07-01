import java.util.*;

public class set 
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<Integer>();

        set.add(53);
        set.add(46);
        set.add(85);
        set.add(92);
        set.add(23);
        set.add(53);
        set.add(45);

        for(int i: set)
        {
            System.out.print (i+ " ");
        }
        System.out.println();

        Set<Integer> set1 = new TreeSet<Integer>();

        set1.add(53);
        set1.add(46);
        set1.add(85);
        set1.add(92);
        set1.add(23);
        set1.add(53);
        set1.add(45);

        for(int i: set1)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        Iterator <Integer> it=set1.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
            
    }    
}
