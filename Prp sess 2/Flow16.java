public class Flow16{
public static void main(String args[]){
	int num=Integer.parseInt(args[0]);
	int rev=0,rem;
		while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
	System.out.println(rev);
	}
}
				