
public class ThisKeywordUsedToInvokeCurrentClassMethod {

	public void display() {
		  
		  System.out.println("Hello"); 
		  }
		  
		  public void show() {
		  
		  this.display(); // calling current class method by this keyword
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordUsedToInvokeCurrentClassMethod obj = new ThisKeywordUsedToInvokeCurrentClassMethod();
		 
		  obj.show(); //calling show method
	}
}
