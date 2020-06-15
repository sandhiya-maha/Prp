public class Array14{
public static void main(String args[]){
	int[][] arr1=new int[3][3];
	int k=0;
	if(args.length==9){
	  for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++){
			arr1[i][j]=Integer.parseInt(args[k]);
			k++;
		}
	}
	System.out.println("the given array is:");
	int max=arr1[0][0];
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++){
			System.out.print(arr1[i][j]+" ");
			 if(arr1[i][j]>max)
				max=arr1[i][j];
		}
		System.out.println();
	}
	System.out.println("The biggest number in the array is "+max);
    }
else{
	System.out.println("please enter 9 integer numbers");
	}
  }
}

	