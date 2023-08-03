package JavaProgrames;

public class stringPalindrome {


	public static void main(String[] args) {

		String s="dad";
		String rev="";

		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
		if(rev.equalsIgnoreCase(s)) {

			System.out.println(s+ " is a palindrome");
		}
		else {System.out.println(s+" is not a palindrome");
		}}

}
