import java.util.*;

public class BinarySearch 
{
    public static void main(String[] args) {
        
    
    int arr[]={45,32,67,58,21,12,34,8,0,6,4};

    List<Integer> list=new ArrayList<Integer>();
    int n=arr.length;
    int k=12;
    int ans=-1;

    for(int i=0; i<n; i++)
    {
        list.add(arr[i]);
    }

    Collections.sort(list);

    for(int i: list)
    {
        System.out.print(i+" ");
    }

    System.out.println();

    //Binary Search

    int i=0;
    int j=list.size()-1;
    int mid=(i+j)/2;

    while(i<=j)
    {
        if(list.get(mid)==k)
        {
            ans=mid;
            System.out.println("Element found");
            break;
            
        }
        else if(list.get(mid)<k)
        {
            i=mid+1;
        }
        else
        {
            j=mid-1;
        }
        mid=(i+j)/2;

    }
    if(ans==-1)
    System.out.println("Element not present");
    
    }
}
