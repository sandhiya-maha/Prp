public class Flow15{
	public static void main(String[] args) {
	int num= Integer.parseInt(args[0]);
	int len = args.length;
	int i,j;
	if(len==1){
		for(i=1;i<=num;i++)
			{
				for (j=1;j<=i;j++) 
					{
						System.out.print("* ");
					}
				System.out.println();
			}
	       }
	else{
		System.out.println("Please enter an integer number");
	  }
    }
}