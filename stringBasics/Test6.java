package stringBasics;
import java.util.Scanner;
public class Test6 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=sc.next();
		int n1=s1.length();
		System.out.println("Enter the String 2");
		String s2=sc.next();
		int n2=s2.length();
		if(n1!=n2 || n1==0 || n2==0 ) {
		if(n1<n2)
		{
			System.out.println(s1+s2+s1);
		}
		else {
			System.out.println(s2+s1+s2);
		}
		}

	}

}
