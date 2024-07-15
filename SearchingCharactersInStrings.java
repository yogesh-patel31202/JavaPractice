public class SearchingCharactersInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="deepak";
		
		System.out.println(s.indexOf('e'));//1 retrun int
		System.out.println(s.indexOf("ep"));//2
		System.out.println(s.lastIndexOf('e'));//2
		System.out.println(s.charAt(3));//P String retrun
		System.out.println(s.contains("ep"));//true ,boolen retrun
		System.out.println(s.startsWith("d"));//true ,boolen retrun
		System.out.println(s.endsWith("a"));//flase ,boolen retrun
	}

}


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