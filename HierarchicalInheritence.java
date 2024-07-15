	/*
	 * Hierarchical inheritence
	 * Hierarchical inheritence me do alag alag class
	 * ek hi class ko extend karti he 
	 * jese es Example me Y our Z class ne X class ko extend kiya he 
	 */

class X{				//X is a parent class or super class
	void showX(){		//showX is a parent class method
	System.out.println("parent class method");
	}
}

class Y extends X{		//y is child class 
						//extenks keyword se parent class ki property child class me aati he
						//jise inherite or inheritence kahate he 
	void showY(){
		System.out.println("y child class method");
	}
}

public class HierarchicalInheritence extends X{
	void showZ(){
		System.out.println("z child class method");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X objx= new X();
		objx.showX();		//x class ke object se x class ki method ko call kar satke he
							// is tarike se ham bina inheritence ke bhi call kar skate he
		
	System.out.println(".....................");
	
	Y objy= new Y();
		objy.showX();		//inheritence ke use se child class ke object ke dvara parent class ki method call karna
		objy.showY();
	System.out.println("...................");

	HierarchicalInheritence  objz= new HierarchicalInheritence();
		objz.showX();
		objz.showZ();
	}
}
