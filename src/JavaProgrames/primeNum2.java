package JavaProgrames;

public class primeNum2 {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=100;i++) {
			
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					
					count=count+1;
					
				}
				
				
			}if(count==0) {
				
				System.out.println(i+" is a prime number");
			}else {
				count=0;
			}
			
			
		}
		
		
	}
	
	
	

}
