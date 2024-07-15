
public class MethodOverloadingSecondExample{

	void show(int a) {
		System.out.println("int  method");
	}
	void show(int... a) {
		System.out.println("varargs method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingSecondExample m_obj = new MethodOverloadingSecondExample();

		m_obj.show(12);
		m_obj.show(24,36,48);
		m_obj.show();	//show(int... a) method ko call karega 
						//int... array ka kam karta he. show() me kuch bhi pas ni kar rhe he.
						//matalab array ki length kuch nhi he. matalab index = length-1
						//index ki value minus me aayegi Ex. length 0 hone par index -1 hoga.
						//jis karan run time par exception milega

	}

}
