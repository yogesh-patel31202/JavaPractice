import java.util.ArrayList;

public class CollectionInterfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());
	
		al.add(100);//as in obejct add hoga
		al.add("suraj");
		al.add('c');
		
		
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.add("ddd"));
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.contains("ddd"));
		System.out.println(al.contains(500));
		
		//al.remove(100);
		al.remove("suraj");
		System.out.println(al);
		ArrayList al2 = new ArrayList();

		al2.add("aaa");//as in obejct add hoga
		al2.add("bbb");
		al2.add("ccc");
		
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		ArrayList al3 = new ArrayList();

		al3.add("aaa");//as in obejct add hoga
		al3.add("suraj");
		al3.add("ccc");
		al.removeAll(al3);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		

	}

}
