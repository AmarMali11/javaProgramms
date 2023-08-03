package JavaProgrames;

public class palindromNumber {
	
	public static void main(String[] args) {
	
	int num=121;
	int org_num=num;
	int rev=0;
		
		while (num!=0) {
			
			int reminder=num%10;
			
			rev=rev*10+reminder;
			num=num/10;
			
		}
		System.out.println(rev);
	if(org_num==rev) {
		System.out.println(org_num+ " is a palindrome");
	}else {
		
		System.out.println(org_num+ " is not a palindrome");
	}
	
	
	}}
