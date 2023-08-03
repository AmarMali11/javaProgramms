package JavaProgrames;

import java.util.HashMap;
import java.util.Map;

public class VowelAndConsonantsCountOfString {

	public static void main(String[] args) {
	


		String s="amatttrqw aa ee aaamari";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		char a[]=s.toCharArray();
		
		int vowelscount=0;
		int consonantsCount=0;
		int charactorCount=0;
		Map<Character, Integer>map=new HashMap<>();
		Map<Character, Integer>map1=new HashMap<>();
	
		for(int i=0;i<=a.length-1;i++)
		{
			charactorCount=0;
			
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' ||a[i]=='o' ||a[i]=='u')
			{
				vowelscount++;
				for(int j=0;j<=a.length-1;j++)
				{ 
					if(a[i]==a[j]) {
						charactorCount++;
						map.put(a[i], charactorCount);}
				}
			}
			else
			{
				consonantsCount++;

				for(int j=0;j<=a.length-1;j++)
				{ 
					if(a[i]==a[j]) {
					charactorCount++;
					map1.put(a[i], charactorCount);}
				}

			}
		}
		
		System.out.println("count of Vowels : "+vowelscount);
		System.out.println(map);
		System.out.println("Consonant count : "+consonantsCount);
		System.out.println(map1);

		
		
	}

}
