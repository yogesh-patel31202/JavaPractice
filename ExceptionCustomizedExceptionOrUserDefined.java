import java.util.Scanner;
public class ExceptionCustomizedExceptionOrUserDefined {

	public static void main(String[] args) throws UnderAgeException {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age: ");

		int age = s.nextInt();
		
		try {
			
		if (age < 18) {

			throw new UnderAgeException("You are not eligible for voating");
		
			
		} else {
			System.out.println("eligible for voating");
		}
		}
		
		 catch (UnderAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		}
}

	



//.......................


class UnderAgeException extends Exception {
	
	UnderAgeException() {
		super();

	}

	UnderAgeException(String msg) {
		super(msg);

	
}

}

