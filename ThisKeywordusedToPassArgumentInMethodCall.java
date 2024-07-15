
public class ThisKeywordusedToPassArgumentInMethodCall {

	  void methodOne(ThisKeywordusedToPassArgumentInMethodCall obj) { //passing current class object in method
		  
		  System.out.println("no arg"); }
		  
		  void methodTwo() {
		  
			  methodOne(this); //using this keyword passing argument in method
			  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordusedToPassArgumentInMethodCall obj = new ThisKeywordusedToPassArgumentInMethodCall();
		obj.methodTwo(); //calling methodTwo by class object
	}

}
