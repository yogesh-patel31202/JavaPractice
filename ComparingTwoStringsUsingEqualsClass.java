public class ComparingTwoStringsUsingEqualsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="deepak";
		String s2="ram";
		String s3="Deepak";
		System.out.println(s1.equals(s2));//true/flase
		
		System.out.println(s1.equalsIgnoreCase(s3));
		if(s1.equals(s2)){
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//String ss1="a";//97
		//String ss2="A";//65
		//String ss1="aB";//97
		//String ss2="aC";//65
		
		
		String ss1="aB";//97
		String ss2="AC";//65
		
		String ss3="deepak";//97
		String ss4="";//65
		
		
		System.out.println(s1.compareTo(s1));//32 int
		System.out.println(s1.compareToIgnoreCase(s1));//32 int
		System.out.println(ss3.compareTo(ss4));//lenght mil jayegi
				

	}

}