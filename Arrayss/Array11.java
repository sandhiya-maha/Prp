import java.util.*;
public class Array11{
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
        boolean flag=false;
	for(i=0;i<n;i++)
	{
		if(arr[i]==1 || arr[i]==4)
			{
				flag=true;
			}
		else{
			flag=false;
			break;
		}
	}
  if(flag==true)
	{
		System.out.println("True");
	}
  else{
	System.out.println("False");
	}
  }
}