import java.util.*;
public class Array4{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=sc.nextInt();
	int[] arr=new int[n];
	int i=0;
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	for(i=0;i<n;i++)
		{
		System.out.println((char)(arr[i]));
		}
	}
}