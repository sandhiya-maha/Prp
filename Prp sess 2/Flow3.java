public class Flow3{
public static void main(String args[]){
	if(args.length==0)
	    {
		System.out.println("No values");
	     }
	else
	   {
		int i=0;
		for(String num:args)
			{
			   System.out.print(num);
			      if(i<args.length-1)
				 System.out.print(",");
			  i++;
			}
	   }
   }
}
