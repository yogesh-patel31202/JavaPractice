/* Method overloading example
 * method overloading condition:
 * 1. same class honi chahiye 
 * 2. mathod ka name same hona chahiye. 2 or more then 2 method hona chahiye
 * 3. argument different hona chahiye 
 */

public class MethodOverloading
	{

	void show(String b) {
		System.out.println("String show");
	}
	
	void show(StringBuffer a) {
		System.out.println("StringBuffer Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m_obj = new MethodOverloading();

		m_obj.show("abc");
		m_obj.show(new StringBuffer("xyz"));	
		}
}

/*
 *  ek hi class me 2 same name ki method he Ex. show()
 *  lakin method me pas argument deferent he 
 *  	show(String b)
 *  	show(StringBuffer b)
 */
