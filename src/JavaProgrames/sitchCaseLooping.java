package JavaProgrames;

import java.util.Scanner;

public class sitchCaseLooping {


	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Day : ");
		String Day=sc.nextLine();
			
		switch(Day)
			{
			case "Sunday": System.out.println("Tdoay is Sunday");
			break;
			case "Monday": System.out.println("Today Is Monday");
			break;
			case "Tuesday": System.out.println("TOday is Tuesday");
			break;
			}

	
	}}
