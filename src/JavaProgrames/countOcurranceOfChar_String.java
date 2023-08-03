package JavaProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class countOcurranceOfChar_String {


	public static void main(String[] args) 

	{


		String s="Bhagyashree Amar Mali";
		s=s.replace(" ","");
		s=s.toUpperCase();
		int count=0;
		char ch[]=s.toCharArray();
		Map<Character, Integer>map=new HashMap<>();

		for(int i=0;i<=ch.length-1;i++)
		{
			count=0;

			for(int j=0;j<=ch.length-1;j++)
			{ 	
				if(ch[i]==ch[j])
				{
					count++;

				}
				map.put(ch[i], count);

			}

		}
		System.out.println(map);






	}}
