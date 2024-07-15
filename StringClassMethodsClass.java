import java.util.Scanner;

public class StringClassMethodsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "raj";
		String email = "raj@gmail.com";
		
		System.out.println(name.length());// return int value
		// String name = "null";
		// String name = "   ";
		int i = name.length();
		if (i == 0) {

			System.out.println("String is empty");
		} else {
			System.out.println("valid name");

		}

		// ..............isEmpty() Method................
		// not value null
		boolean b = name.isEmpty();// return true
		if (b == true) {// (b)

			System.out.println("String is empty");
		} else {
			System.out.println("valid name");

		}

		// ............ trim() Method................

		String name1 = "  ankit   veram  ";
		System.out.println(name1);
		System.out.println(name1.trim());
		String name2="   ";
		if(name2.trim().isEmpty()){//if(name2.trim().length()==0){
			System.out.println("name is empty");
			
		}else {
			System.out.println("valid name");
			
		}
		
		// ............ trim() Method................

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		String name11 = sc.next();
		
		char [] pass=  {'a','b'};
		String s=new String(pass);
		
		if(name11.trim().length()==0|| name11.trim().isEmpty()){
			System.out.println("name cannot empty");
			
		}
		
		else if(s.trim().length()==0){
			System.out.println("pass cannot empty");
			
		}
		else{
			
			System.out.println("pass cannot empty");
		}

	}

}