package JavaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class fabonachiSeries {


	public static void main(String[] args) 

	{
		int a=0,b=1,c;

		System.out.print(a+ " "+b+" ");
		
		for(int i=1;i<10;i++) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;

		}				



	}}
