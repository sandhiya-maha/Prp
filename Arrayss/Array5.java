import java.util.*;
public class Array5{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	int i=0;
	int j=0;
	int temp=0;
	System.out.println("enter the array elemnts");
	for(i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n-1;j++){
			if(arr[i]>arr[j])
		  {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
                   
		  }
		}
	}
	System.out.println("Largest 2 numbers are "+arr[n-2]+" and "+arr[n-1]);
	System.out.println("Smallest 2 numbers are "+arr[0]+" and "+arr[1]);
	
   }
 }
	