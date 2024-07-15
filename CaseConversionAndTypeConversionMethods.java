
public class CaseConversionAndTypeConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		//case conversion
		String name="deepak";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		//type casting
		
		int a=10;
		int b=20;
		
		String s=String.valueOf(a);
		String s2=String.valueOf(b);
				
		System.out.println(s+s2);
		System.out.println(a+b);
		
		char []c=name.toCharArray();
		System.out.println(c);
		
		

	}

}