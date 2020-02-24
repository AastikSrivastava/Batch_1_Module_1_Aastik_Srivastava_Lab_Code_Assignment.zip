package Core_Java_Lab_Code_7;

public class Exercise8 {

	static int[] modifyArray(int arr[])
	{
		int len = arr.length;
		int brr[]= new int[len];
		int crr[] = new int[len];
		
		for(int k=0;k<len;k++)
		{
				brr[k]=arr[k];
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[len-1];
					len--;
					j--;
				}
				
			}
		}
		
		return arr;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,5,6,5,8,6,9,3,9,4,7,9};
		
		for(int x:Exercise8.modifyArray(arr))
		   {
			   System.out.println(x+" ");
		   }
	}

}