public class ProgramToReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ........start Program to Check String is Palindrome or not......
		
		
		 
		 String s2 = "naman";
		 String rev = "";
		  
		 for (int i = s2.length() - 1; i >= 0; i--) {
			 
			 rev = rev + s2.charAt(i);
		  
		 }
		 
		 System.out.println(rev);
		 
		 if(s2.equals(rev)){
			 System.out.println("String is Palindrome");
			 
		 }else {
			 System.out.println("String is not Palindrome");
		}
		
		

		// ........End Program to Check String is Palindrome or not......

	}
}

// .............Start. Program to Reverse a String......

/*
 * String s = "Suraj"; String rev = "";
 * 
 * for (int i = s.length() - 1; i >= 0; i--)
 *  { rev = rev + s.charAt(i);
 * 
 * }
 * 
 * System.out.println(rev);
 */
// ..............End Program to Reverse a String......