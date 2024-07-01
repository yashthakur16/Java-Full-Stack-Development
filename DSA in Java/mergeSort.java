import java.util.*;

public class mergeSort 
{

    public static void merge(int arr[],int start,int end)
    {
        int mid=start+((end-start)/2);

        int length1=mid-start+1;
        int length2=end-mid;

        int arr1[]=new int[length1];
        int arr2[]=new int[length2];

        int k=start;
        for(int i=0;i<length1;i++)
        {
            arr1[i]=arr[k++];
        }

        k=mid+1;

        for(int i=0;i<length2;i++)
        {
            arr2[i]=arr[k++];
        }

        int i=0;
        int j=0;
        k=start;

        while(i<length1 && j<length2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k++]=arr1[i++];
            }
            else
            {
                arr[k++]=arr2[j++];
            }
        }

        while(i<length1)
        {
            arr[k++]=arr1[i++];
        }

        while(j<length2)
        {
            arr[k++]=arr2[j++];
        }

        return;



    }
    public static void MergeSort(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }

        int mid=start+((end-start)/2);

        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);

        merge(arr,start,end);
    }
    public static void main(String[] args) 
    {
        int arr[]={45,32,67,58,21,12,34,8,0,6,4};

        int n=arr.length-1;
        MergeSort(arr,0,n);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

        // LinkedList<Integer> LL=new LinkedList<>();
        // Stack<Integer> stack=new Stack<>();
        // Queue<Integer> queue=new Queue<>();

           
    }
}
