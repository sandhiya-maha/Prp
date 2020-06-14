public class Flow14{
public static void main(String args[]){
	int num=Integer.parseInt(args[0]);
	int rem,sum=0;
		while(num>0)
			{
				rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
	System.out.println(sum);
	}
}
				