package JavaProgrames;

import java.util.HashSet;
import java.util.Set;

public class arrayDuplicateValues {

	public static void main(String[] args) {

		int a[]= {12,34,23,4,22,33,12,22,33,55};

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println("Duplicate Values "+ a[j]);
				}
			}
		}


		/* using masps and HashSet Map Hasset is not allowing duplicate values */

		Set<Integer> s=new HashSet<>();
		for(int values:a)

		{
			if(s.add(values)==false) {
				
				System.out.println(values);

			}
		}
	}
}
