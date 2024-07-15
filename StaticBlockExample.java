
public class StaticBlockExample {

		//static block executes automatically.
		//when the class is loaded in the memory.
		
		static int a;

		static {

			a=10;				//Static block used to initialize the static members.
			System.out.println("First block");
			//System.exit(0); 	//JVM close	
								//Esake use se main method ko execute kiye bina hi program ko stop kar sakte he 

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Main method");
		}
		
		static {			// Multiple static block 

			System.out.println("Second Block");
					// Multiple static block 

		}

}
