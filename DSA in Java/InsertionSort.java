public class InsertionSort 
{
    public static void main(String[] args) {
        int arr[]={45,32,67,58,21,12,34,8,0,6,4};
    
        for(int i=0;i<arr.length-1;i++)
        {
          int j=i+1;
          int key=arr[j];

          while(j>=1&&key<arr[j-1])
          {
            arr[j]=arr[j-1];
            j=j-1;
          }
          arr[j]=key;
          
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
