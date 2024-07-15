
class SuperConstructorCall {	//parent class

	SuperConstructorCall()	{

		System.out.println("Calling parent class constructor");

	}
}

public class SuperKeywordInvokeParentClassConstructor extends SuperConstructorCall  {
				// child class

	SuperKeywordInvokeParentClassConstructor() {

		super();	//parent class ke constructor ko direct call karta he super keyword		
		
		System.out.println("Calling child class constructor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordInvokeParentClassConstructor obj = new SuperKeywordInvokeParentClassConstructor();
	}

}
