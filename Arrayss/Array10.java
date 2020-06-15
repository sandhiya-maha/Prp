import java.util.*;
public class Array10{
public static void main(String args[]){
	int[] arr=new int[args.length];
	for(int i=0;i<args.length;i++){
		arr[i]=Integer.parseInt(args[i]);
	}
  int[] arr1=new int[arr.length];
  int k=0;
  for(int i=0;i<arr.length;i++){
	if((arr[i]%2==0) || arr[i]==0){
		arr1[k]=arr[i];
		k++;
		}
	}
  for(int i=0;i<arr.length;i++){
	if(!(arr[i]%2==0))
		{
			arr1[k]=arr[i];
			k++;
		}
	}
  for(int i=0;i<arr1.length;i++){
	System.out.print(arr1[i]+" ");
	}
   }	
	
}