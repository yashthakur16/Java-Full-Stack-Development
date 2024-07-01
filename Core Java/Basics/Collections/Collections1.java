import java.util.*;

public class Collections1
{
        public static void main(String[] args) 
        {
            Collection<Integer> nums=new ArrayList<Integer>();  
            
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            nums.add(9);
            nums.add(10);

            for(int i : nums)
            {
                System.out.println(i);
            }

            List<Integer> arr=new ArrayList<Integer>();

            arr.add(5);
            arr.add(16);
            arr.add(7);
            arr.add(388);
            arr.add(19);
            arr.add(10);
            arr.add(8);

            for(int i=0;i<arr.size();i++)
            {
                System.out.print(arr.get(i)+" ");       //getting element using index
            }
            System.out.println();

            System.out.println(arr.indexOf(9)); //Find the index of Element

            System.out.println(arr.lastIndexOf(8));

            Collections.sort(arr);

            for(int i: arr)
            {
                System.out.print(i+" ");
            }

            
        }
}