/*
 * Multilevel inheritence 
 *level by level class ka inherite hona.
 *	Ex.	class Q extend P
 * 		class R extend Q
 * 		class S extend R
 * 	P -> Q -> R -> S
 */


class P{
		void showP(){
		System.out.println("parent class method");
		}
	}

	class Q  extends P{
		void showQ(){
			System.out.println("parent child class method");
		}
	}
public class MultilevelInheritence extends Q {

	
	void showR(){
		System.out.println("child  class method");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P objP= new P();
		objP.showP();

	System.out.println("....................");
		Q objQ= new Q();
		objQ.showP();
		objQ.showQ();
	System.out.println(".....................");

	MultilevelInheritence objMLI= new MultilevelInheritence();
	objMLI.showP();
	objMLI.showQ();
	objMLI.showR();
	}
}
