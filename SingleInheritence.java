
class ParentClass{	//parent class
	void showA(){
	System.out.println("parent class method");
	}
}

public class SingleInheritence extends ParentClass {	//child class
	void showB(){
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass objChildClass= new ParentClass();
		
		SingleInheritence objb= new SingleInheritence();
		objb.showA();
		objb.showB();
	}
}
