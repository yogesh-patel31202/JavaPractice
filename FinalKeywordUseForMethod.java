
	//If we create any final method , we cannot override it. class finalOne 

class FinalMethodClass{

	final void method() {
	System.out.println("Method cannot be change"); 
	
  	}	
}

public class FinalKeywordUseForMethod extends FinalMethodClass{
	
	/*	void m1() {			//Final method ko override nhi kar sakte.

		System.out.println("Two"); 
		}	
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeywordUseForMethod obj = new FinalKeywordUseForMethod(); 
		obj.method();
		/*Inheritance ke use se parent class 
		 * ki method ko chaild class ki 
		 * method se call karna.	*/
		
	}

}
