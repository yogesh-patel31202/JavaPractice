
class SuperKeywordA {
	void show() {
		System.out.println("String show A");
	}
}
public class MethodOverridingSuperKeyword extends SuperKeywordA {
	void show() {
		super.show();	//super keyword automatic call parent class Object
		System.out.println("String show B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingSuperKeyword m_obj = new MethodOverridingSuperKeyword();
		m_obj.show();
	}
}

