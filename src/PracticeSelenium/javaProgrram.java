package PracticeSelenium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class javaProgrram extends methods {


	public static void main(String[] args) 

	{
		javaProgrram jp=new javaProgrram();
		
		jp.Addition();
		jp.parent();
		jp.child();
	
		System.out.println(parent_static_method(1, 2));
		System.out.println("Summ Method: "+Summ(10, 20));

	}
	
	

	public static int Summ(int i, int j) 
	{
		int c=i+j;
		
		return c;
	}

	public void child()
	{
		System.out.println("Child Non Static Method");
	}


}
