public class Array1{
public static void main(String args[]){
	//int[] arr=new int[]{1,2,3,4,5};
	int[] arr=new int[args.length];
	int avg=0;
	int sum=0;
	int n=arr.length;
	for(int i=0;i<args.length;i++)
		{
		   arr[i]=Integer.parseInt(args[i]);
		}
	for(int i=0;i<n;i++)
	{
		sum=sum+arr[i];
		avg=sum/n;
	}
	System.out.println("Sum  "+sum);
	System.out.println("Average  "+avg);
	}
}
			