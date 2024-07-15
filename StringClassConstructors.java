public class StringClassConstructors {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("deepak");//no arg Constructors
		System.out.println(s.length());
		
		StringBuffer sb=new StringBuffer("deepak");//create mutable object
		String s2=new String(sb);////String create immutable  object
		System.out.println(s2);
		
		StringBuilder sb1=new StringBuilder("deepak");//create mutable object
		String s3=new String(sb1);////String create immutable  object
		System.out.println(s3);
		//convert mutable to immutable object
		
		byte [] b={101,102,103};//pass Byte array
		String s4 = new String(b);
		System.out.println(s4);
		
		char [] c ={'a','b','c'};//pass char array
		String s5 = new String(c);
		System.out.println(s5);
		
		//..Why char array is preferred over string for strong password?.....
		
		
		String ss2 = new String("abc");
		System.out.println(ss1);
		
		
System.ou

}char[] {'a','b','c'};//pass char array