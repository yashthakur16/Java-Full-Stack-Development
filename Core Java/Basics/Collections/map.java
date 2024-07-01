import java.util.*;

public class map 
{
    public static void main(String[] args)
    {
        Map<String,Integer> mpp=new HashMap<String,Integer>();
        mpp.put("Yash", 100);
        mpp.put("Kaushal", 40);
        mpp.put("Kaushik", 32);
        mpp.put("Aditya", 82);

        for(String i: mpp.keySet())
        {
            System.out.println(i+"  "+mpp.get(i));
        }

        // for(int i : mpp.values())
        // {
        //     System.out.println(i+"");
        // }

        
        Map<String,Integer> mpp1=new Hashtable<String,Integer>();     //Hashtable works same but is used for synchronized process
        mpp1.put("Yash", 100);
        mpp1.put("Kaushal", 40);
        mpp1.put("Kaushik", 32);
        mpp1.put("Aditya", 82);

        for(String i: mpp.keySet())
        {
            System.out.println(i+"  "+mpp.get(i));
        }

    }
}
