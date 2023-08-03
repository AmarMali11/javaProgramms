package JavaProgrames;

import java.util.Set;

public class countVowelsInString {


	public static void main(String[] args) 

	{

		String s="Hello Hi ee ee";

		s=s.toLowerCase();

		int Vowel_count=0;
		int Consonant_count=0;
		int Spce_count=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(ch!=' ') {
				if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u')
				{
					Vowel_count++;
					System.out.print(ch+" ");
				} else
				{
					Consonant_count++;
				}
			}else
			{
				Spce_count++;
			}
		}


		System.out.println("  Vowel Count: "+Vowel_count);
		System.out.println("Consonant count:" +Consonant_count);
		System.out.println("String Spce count: "+Spce_count);
		System.out.println(s.length());






	}}
