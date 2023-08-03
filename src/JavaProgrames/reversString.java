package JavaProgrames;

public class reversString {
	
	public static void main(String[] args) {
		
		String s="Hello World";
		String rev="";
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+a[i];
			//rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}
	
	
	

}
