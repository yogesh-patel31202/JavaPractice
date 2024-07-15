
public class ThiskeywordUsedToInvokeCurrentClassConstrator {

	ThiskeywordUsedToInvokeCurrentClassConstrator(){
		  
		  System.out.println("no arg"); 
		  }
	  
	ThiskeywordUsedToInvokeCurrentClassConstrator(int a) { 
		this(); //calling current class constructor
		//No argument ClassName()

	  
		System.out.println("arg");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThiskeywordUsedToInvokeCurrentClassConstrator obj = new ThiskeywordUsedToInvokeCurrentClassConstrator(25);
			//calling current class argument constructor
	}

}
