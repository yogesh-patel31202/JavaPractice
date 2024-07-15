class SuperInstanceVariableCall { 
	int i = 10;		//instance variable
	}

public class SuperKeywordInvokeParentClassInstanceVariable extends SuperInstanceVariableCall {

	 int i = 20;	//instance variable 
	  
	 void show(int i) {
	  
		 System.out.println(super.i);	//super keyword ke use se parent class object ko direct call karna 
		 
		 System.out.println(i);
	 	  
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordInvokeParentClassInstanceVariable obj = new SuperKeywordInvokeParentClassInstanceVariable();
		 
		obj.show(30);

	}

}
