import java.util.Scanner;

class YoungerAgeException extends RuntimeException {

	YoungerAgeException(String msg) {
		super(msg);

	}
}

public class ExceptionHandlingThrowKeywordCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age: ");

		int age = s.nextInt();
		s.close();
		
		try {
			
		
		if (age < 18) {

			throw new YoungerAgeException("You are not eligible for voating");
		
			
		} else {
			System.out.println("eligible for voating");
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Program Complete successful");

	}

}
