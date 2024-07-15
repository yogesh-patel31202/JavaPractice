public class StringConcatenationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="deepak";
		
		String s2="java";
		
		System.out.println(s1+s2);//
		
		System.out.println(s1+10);//
		System.out.println(s1+10+20);//
		System.out.println(10+s1+s2);//
		System.out.println(10+20+s1);//
		System.out.println(s1+20/10);//
		System.out.println(s1+20*10);//
		//System.out.println(s1+20-10);//
		System.out.println(s1.concat(s2));//
		
		System.out.println(String.join(",", s1));//
		System.out.println(String.join("My", s1,s2,s1));//
		
		String s3="my center name  is mykhandwa";
		
		System.out.println(s1.subSequence(3, 9));//
		System.out.println(s1.substring(3));//
		System.out.println(s1.substring(3, 11));//
		//System.out.println(s1.substring(3, -11));//
		System.out.println(s1.substring(0, 0));//
		
		
		

	}

}