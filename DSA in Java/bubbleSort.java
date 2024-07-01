public class bubbleSort 
{
    public static void main(String[] args) {
    int arr[]={45,32,67,58,21,12,34,8,0,6,4};

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i: arr)
    {
        System.out.print(i+" ");
    }

}
    
}
