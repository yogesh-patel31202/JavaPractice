
public class ThisKeywordUsedToReturnRurrentClassInstanceFromMethod {

	ThisKeywordUsedToReturnRurrentClassInstanceFromMethod methodOne() //this class ka instance hota he jisase ham use class name se object ki tarah call kar sakte he 
	{
		System.out.println("methodone");
		return this; //using this keyword as a return type 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordUsedToReturnRurrentClassInstanceFromMethod obj = new ThisKeywordUsedToReturnRurrentClassInstanceFromMethod();
		obj.methodOne(); //normal calling methodOne

	}

}
