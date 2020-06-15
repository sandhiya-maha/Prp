import java.util.*;
public class Array12{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int[] arr1=new int[3];
	System.out.println("Enter 1st array elemts");
	for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
	int[] arr2=new int[3];
	System.out.println("Enter2nd array elemts");
	for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
	int[] arr3=new int[2];
	arr3[0]=arr1[1];
	arr3[1]=arr2[1];
	System.out.println("Middle elements");
	for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
