package JavaProgrames;

public class primeNumber {
	
	public static void main(String[] args) {
		
		int num=8;
		int count=0;
		for (int i=2;i<num-1;i++) {
			
			if(num%i==0) {
				count=count+1;
			}
			
		}
		if(count==0) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		
	}
	
	

}
