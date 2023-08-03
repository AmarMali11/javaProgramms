package JavaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class reversEachWordOfString {
	
	
	public static void main(String[] args) 
	
	{
		
		String s="Amar Mali";
		String words[]=s.split(" ");
		String revword="";
		String revWordsString="";
		
		for(String word : words)
		{
			//String revword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			revWordsString=revWordsString+revword+" ";
			 revword="";
		}
		
		System.out.println(revWordsString);
		
	
		
		
			
		}}
