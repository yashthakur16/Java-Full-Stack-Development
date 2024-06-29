public class quickSort 
{
    public static int partition(int arr[],int start,int end)
    {
        int pivot = arr[start];
        int count=0;

        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]<pivot)
            {
                count++;
            }
        }

   

        int pivotIndex = start + count;

        arr[start]=arr[pivotIndex];
        arr[pivotIndex]=pivot;

        int high=end;
        int low=start;

        while(low<pivotIndex && high>pivotIndex)
        {
            if(arr[low]<pivot)
            {
                low++;
            }
            else if(arr[high]>pivot)
            {
                high--;
            }
            else if(arr[high]<pivot&&arr[low]>pivot)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
        }

        return pivotIndex;
    }

    public static void QuickSort(int arr[], int start, int end)
    {

        if(start>=end)
        {
            return;
        }
        int pivot=partition(arr, start, end);

        

        QuickSort(arr,start,pivot-1);
        QuickSort(arr,pivot+1,end);
    }
    public static void main(String[] args) {
        int arr[]={45,32,67,58,21,12,34,8,0,6,4};

        QuickSort(arr,0,arr.length-1);




        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    
    }
}
