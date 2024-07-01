public class LinearSearch 
{
    public static void main(String[] args)
    {
        int arr[]={45,32,67,58,21,12,34,8,0,6,4};

        int n=arr.length;
        int k=42;
        int ans=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                ans=i;
                System.out.println("Element found at index "+i);
                
            }
        }
        if(ans==-1)
        System.out.println("Element not present");
    }
}