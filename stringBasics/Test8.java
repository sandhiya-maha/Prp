package stringBasics;

import java.util.Scanner;

public class Test8 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		String[] s2=s1.split("");
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].equals("*"))
			{
				s1=sb.delete(i-1, i+2).toString();
				break;
			}
		}
		System.out.println(s1);
		
	}
		
	

}
