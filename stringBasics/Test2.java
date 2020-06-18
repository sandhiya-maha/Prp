package stringBasics;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string s1");
		String s1=sc.next().toLowerCase();
		System.out.println("Enter the string s2");
		String s2=sc.next().toLowerCase();
		int n1=s1.length();
		int n2=s2.length();
		char a1=s1.charAt(n1-1);
		char a2=s2.charAt(0);
		String b1=Character.toString(a1);
		String b2=Character.toString(a2);
		if(b1.equals(b2)) {
			  String s3=s2.substring(1,n2).toLowerCase();
			System.out.println(s1+s3);
		}
		else {
			System.out.println(s1+" "+s2);
		}
		/*if(a1==a2)
		{
			String s3=s2.substring(1,n2).toLowerCase();
			System.out.println(s1+s3);
			
		}
		else {
			System.out.println(s1+" "+s2);
		}*/

	}

}
