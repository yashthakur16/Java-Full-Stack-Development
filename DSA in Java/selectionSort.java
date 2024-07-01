public class selectionSort 
{
    public static void main(String[] args) {
        int arr[]={45,32,67,58,21,12,34,8,0,6,4};

        // for(int p: arr)
        // {
        //     System.out.print(p+" ");
        // }

        // System.out.println();
    
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    // for(int p: arr)
                    // {
                    //     System.out.print(p+" ");
                    // }

                    // System.out.println();
                }
            }
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

    }
    
}
