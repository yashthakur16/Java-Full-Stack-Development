package unitTesting_02;

public class ReverseString 
{
	public String reverseString(String str)
	{
		char [] arr=str.toCharArray();
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		return new String(arr);
		
	}
}
