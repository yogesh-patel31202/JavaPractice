final class FinalClass{
	final void method() {
		System.out.println("Class cannot be change"); 
		
	  	}	
}
public class FinalKeywordUseForClass // extends FinalClass {
						//{***final class ki sub class nhi bana skate 
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalClass obj=new FinalClass();
		obj.method();
	}

}
