package JavaProgrames;

public class sumOfDigit {
	
	public static void main(String[] args) {
		
		int num=102304050;
		int sum=0;
		
		while(num>0) {
			
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
