
public class ThisKeywordUsedToPassArgumentInConstratorCall {

	void methodOne() {
		Test Test_obj = new Test(this); //passing argument in current class constructor
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordUsedToPassArgumentInConstratorCall obj = new ThisKeywordUsedToPassArgumentInConstratorCall();
		obj.methodOne();

	}

}

class Test {

	Test(ThisKeywordUsedToPassArgumentInConstratorCall Test_obj)//passing current class object in constructor 
	{

		System.out.println("test class constrator");
	}

}


