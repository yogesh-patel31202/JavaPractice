
class CovariantA {
	Object show() {
		System.out.println("String show B");
		return "Any";		//method ka return type Object he 
							//Object sub data type ka parent hota he 
							//jis karan hum Object ke case me koi se bhi data type ki literal value return kar sakte he 
	}
}

public class MethodOverridingCovariantExample extends CovariantA {

	String show(){
		System.out.println("String show A");
		return "Yogesh";	//method ka return type String he 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingCovariantExample m_obj = new MethodOverridingCovariantExample();
		m_obj.show();
		CovariantA b_obj = new CovariantA();
		b_obj.show();

	} 
}
