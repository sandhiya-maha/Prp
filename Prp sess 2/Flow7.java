import java.util.*;
public class Flow7{
public static void main(String args[]){
	char ch=args[0].charAt(0);
	String s=Character.toString(ch);
	if(ch>=65 && ch<=90)
		{
			 s=s.toLowerCase();
			System.out.println(ch+"->"+s);
		}
	else if(ch>=97&& ch<=122)
		{
			s=s.toUpperCase();
			System.out.println(ch+"->"+s);
		}
	
	}
}
		