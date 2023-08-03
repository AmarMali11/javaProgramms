package JavaProgrames;

import java.util.HashSet;
import java.util.Set;

public class duplicateStringArrayValues {
	
	
	public static void main(String[] args) {
	
		String a[]= {"Java","C++","Java","Python","React","C++","React"};
		
		for (int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[i]);
				}
			}
			
		}
		
		
		
		
		Set<String> s=new HashSet<>();
		
		for(String values :a)
		{
			if(s.add(values)==false)
			{
				System.out.println("duplicate Values : "+values);
			}
		}
		
		
		
	}

}
