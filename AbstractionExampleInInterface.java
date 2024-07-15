public class AbstractionExampleInInterface implements interfaceOne,interfaceTwo //multi inheritance 
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractionExampleInInterface obj=new AbstractionExampleInInterface();
		obj.show();
		obj.display();
	}

	@Override
	public void show() //Implementing show method 
	{
		// TODO Auto-generated method stub
		System.out.println("1");
		
	}

	@Override
	public void display() //Implementing display method 
	{
		// TODO Auto-generated method stub
		System.out.println("2");
		
	}

}

interface interfaceOne {
	
      int a=10;
	void show();	//declaring show method

}

interface interfaceTwo {
	
	public static final int a=10;
	void display(); //declaring display method
					//interface me declare ki gyi method ko jaruri nhi he implement karna
}
