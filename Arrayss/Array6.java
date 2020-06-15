import java.util.*;
public class Array6{
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
		for(j=i+1;j<n;j++){
			if(arr[i]>arr[j])
		  {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
                   
		  }
		}
	}
	for(i=0;i<n;i++){
	System.out.print("Sorted elemnts  "+arr[i]);
	}
   }
 }
	