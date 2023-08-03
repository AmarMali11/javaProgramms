package JavaProgrames;

public class amstromeNum {
	public static void main(String[] args) {

		int number=153;
		int T1=number;
		int T2=number;
		int length=0;
		int reminder;
		int mul=1;
		int sum=0;


		while(T1!=0) {

			T1=T1/10;
			length=length+1;
		}


		while(T2!=0) {
			
			reminder=T2%10;

			for(int i=1;i<=length;i++)
			{
				mul=mul*reminder;
			}
			sum=sum+mul;
			mul=1;
			T2=T2/10;
		}


		System.out.println(sum+ " sum of numbers after mutipication");

		if(number==sum) 
		{ 
			System.out.println(number+" is a amstrome number"); 
		}else
			
			System.out.println(number +" is not a amstrome number");

	}}
