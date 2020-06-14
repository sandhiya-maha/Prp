public class Flow13{
public static void main(String args[]){
	for(int i=10;i<100;i++)
		{
			int count=1;
			for(int j=2;j<=99;j++)
				{
				if(i%j==0)
					count=count+1;
				}
		
	if(count==2)
		System.out.println(i);
		}
	}	
} 