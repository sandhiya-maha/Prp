import java.util.*;
public class Array3{
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	int i=0;
	System.out.println("Enter size of an array");
 	int n=sc.nextInt();
	 int[] arr=new int[n];
	System.out.println("Enter array elemtns");
	 for(i=0;i<n;i++)
  		{
			arr[i]=sc.nextInt();
 		 }
 	System.out.println("Enter search element");
 	int check=sc.nextInt();
 	boolean flag=false;
 		for(i=0;i<arr.length;i++)
 			{ 
   			 if(arr[i]==check)
     				 {
        				flag=true;
					break;
     				 }
                          }
	if(flag==true){
 			System.out.println("Search Element is "+ arr[i]+" "+i);
		}
	else{
  			System.out.println("-1");
           }
   
      			
            }
}