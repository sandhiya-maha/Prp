import java.io.*;
import java.util.*;
public class Files3{
	public static void main(String args[]){
		try
			{
			FileReader f=new FileReader("F3in.txt");
			FileWriter fw=new FileWriter("F3out.txt");
			Scanner sc=new Scanner(f);
			TreeMap<String,Integer> t=new TreeMap<String,Integer>();
			int c=0;
			String s="";
			while(sc.hasNext())
			{
			s=sc.next();
			if(s.length()>0){
				if(t.get(s)==null){
					t.put(s, 1);
				}
				else
				{
					int value=t.get(s);
					value=value+1;
					t.put(s,value);
				}}}
			for(Map.Entry<String, Integer> cc:t.entrySet()){
				fw.write(cc.getKey()+"-"+cc.getValue()+"\n");
			}
			if(f!=null)
			{
				f.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
			}
		catch(Exception e)
			{
				System.out.println(e);
			}
	}
	}

