/*
 *Example method overriding
 * method overriding condition
 * 1. class different hona chahiye
 * 2. method ka name same hona chahiye. 2 or more then 2 method hona chahiye
 * 3. argument bhi same hona chahiye
 * 4. inheritence hona chahiye (IS-A relation)
 */

public class MethodOverriding extends B {	
	void show(String b) {
		System.out.println("String show A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m_obj = new MethodOverriding();
		m_obj.show("abc");	//current class ka obj current class ki method ko class kar rha he 

		B b_obj = new B();
		b_obj.show("abc");	//B class ka obj B class Ki method ko class kar rha he
							
	}
}
class B {
	void show(String b) {
		System.out.println("String show B");
	}
}

/*
 * In this ex. class name are different B and MethodOverriding
 * method name is same Ex. show
 * argument same (String b)
 * Inheritence bhi he MethodOverriding class, B class ko extend kar rhi he  
 */
