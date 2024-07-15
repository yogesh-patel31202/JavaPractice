
public class StaticMethodExample {

	static int a = 10;

	static void show() {
		
		one();			//A Static method can call only other static
	
		System.out.println("Current class method");		//A static method cannot refer to this or super keyword in anyway
			
	}


	static void one() { 				// memory management
		display();						//A Static method can call only other static
		System.out.println(a);
	}

	static void display() { 	// memory management

		System.out.println(a);//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethodExample obj= new StaticMethodExample(); 
		show();
		StaticTest.show();
		  
	}

}

class StaticTest {

	static void show() {

		System.out.println("Another Class method");
	}

}
