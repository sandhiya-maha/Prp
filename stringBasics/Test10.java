package stringBasics;

import java.util.*;

public class Test10 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println("Enter n values");
		int n=sc.nextInt();
		int n1=s1.length();
		String s2=s1.substring(n1-n);
		for(int i=0;i<n;i++)
		{
			System.out.print(s2);
		}
		
}
}
