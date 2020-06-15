public class Array2{
public static void main(String args[]){
	int[] arr=new int[args.length];
	for(int i=0;i<args.length;i++)
		{
		  arr[i]=Integer.parseInt(args[i]);
		}
	int min=arr[0];
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	
	if(arr[i]>max)
		{
			max=arr[i];
		}
	if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	/*Arrays.sort(arr);
          int min=arr[0];
	  int n=arr.length;
	  int max=arr[n-1];*/
	System.out.println("Minimum array  "+min);
	System.out.println("Maximum array  "+max);
  }
}
	 