
public class StaticKeywordSecondExample {

	int emap_id; 
	String name; //String company; 
	static String comapny= "Mykhandwa";
	  
	  StaticKeywordSecondExample (int emap_id, String name) {
	  
	 this.emap_id = emap_id;
	 this.name = name; 
	 //this.comapny = Company; 
	 }
	 
	 void display() { System.out.println(emap_id + "," + name + "," + comapny); }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeywordSecondExample obj= new StaticKeywordSecondExample(10, "suraj");
		StaticKeywordSecondExample obj1 = new StaticKeywordSecondExample(20, "raj"); obj.display();
		obj1.display();
		

	}

}
