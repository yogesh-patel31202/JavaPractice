
public class StaticVariableExample {
	
		static int count = 0; // class or method area static instance variable

		StaticVariableExample() {
			count++;
			System.out.println(count);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			StaticVariableExample obj= new StaticVariableExample();
			StaticVariableExample obj1 = new StaticVariableExample();
			StaticVariableExample obj2 = new StaticVariableExample();
			
		}

}
