package JavaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class wordCountInString {
	
	
	public static void main(String[] args) 
	
	{
		
		String s="amar dharmaraj mali ewndwed ejdjdc djsncjd";
		
		char a[]=s.toCharArray();
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(a[i]==' ' && a[i+1]!= ' ')
			{
				count++;
			}
			
		}
		System.out.println("word count : "+count);
		
		
		/* Using Split method */
				
		String s1="amar dharmaraj mali ewndwed ejdjdc djsncjd";
		String words[]=s1.split(" ");
		System.out.println("Word count : "+ words.length);
		
		
	}}
