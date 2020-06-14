public class Flow12{
public static void main(String args[])
{
 	int num=Integer.parseInt(args[0]);
 	boolean f=true;
 	for(int i=2;i<=num/2;i++)
 		{
			if(num%i==0)
			{
			f=false;
			break;
			}
		}
if(f==true)
{
System.out.println("Prime Number");
}
else{
System.out.println("Not a Prime Number");
}
}
}