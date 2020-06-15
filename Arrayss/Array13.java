public class Array13{
public static void main(String args[]){
	int[][] arr1=new int[2][2];
	int k=0;
	if(args.length==4){
	System.out.println("original array");
	  for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++){
			arr1[i][j]=Integer.parseInt(args[k]);
			System.out.print(arr1[i][j]+" ");
			k++;
		}
		System.out.println();
	}
	System.out.println("reverse array");
	for(int i=2;i>0;i--)
		{
		for(int j=2;j>0;j--){
			System.out.print(arr1[i-1][j-1]+" ");
		}
		System.out.println();
	}
    }
else{
	System.out.println("please enter 4 integer numbers");
	}
  }
}

	