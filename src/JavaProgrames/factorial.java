package JavaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class factorial {
	
	
	public static void main(String[] args) 
	
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
	 int num=	s.nextInt();
	 int fact=1;
	 for(int i=1;i<=num;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("Factorial of "+num+" is "+fact);
	 
		
		
		
		
	
		
		
	}}
