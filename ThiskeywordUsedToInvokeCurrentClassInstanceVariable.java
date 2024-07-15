
public class ThiskeywordUsedToInvokeCurrentClassInstanceVariable {
	 private int i; //instance variable 
 
	 public void setValue(int i) {
		 this.i = i; //calling current class instance variable by this keyword
	 }
	  
	 public void showValue() { 
		 System.out.println(i);
	  }
	  
	  public static void main(String[] args) { 
		  // TODO Auto-generated method stub
	  
		  ThiskeywordUsedToInvokeCurrentClassInstanceVariable obj = new ThiskeywordUsedToInvokeCurrentClassInstanceVariable();
	  
	  obj.setValue(50); //setter Method for private
	  obj.showValue(); //getter Method --//--
	  
	  }
}


