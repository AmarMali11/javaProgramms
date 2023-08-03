package JavaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class removeDuplicateCharInString {


	public static void main(String[] args) 

	{

		String s="aawsdhdbhsadbiasdbis";
		Set<Character>set=new HashSet<>();
		
		char a[]=s.toCharArray();
		
		for(int i=0;i<=a.length-1;i++)
		{
			set.add(a[i]);
		}
		
		
		StringBuffer sb= new StringBuffer();
		
		for(Character c: set)
		{
			sb.append(c);
		}
		System.out.println(sb);
		
	}}




