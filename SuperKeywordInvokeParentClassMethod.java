 class SuperMethodCall { 
	 
		 void m1() {
			 System.out.println("Parent class method call");
  
	 } 
}

public class SuperKeywordInvokeParentClassMethod extends SuperMethodCall{

	void m1() { 
		System.out.println("Child class method call");
	  	}

	void show() { 
		
		super.m1();	//parent class method calling 
		m1(); 		//child class or current class method calling 
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordInvokeParentClassMethod obj = new SuperKeywordInvokeParentClassMethod();
		  
		obj.show();

	}

}
