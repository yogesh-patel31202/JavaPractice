import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionListIteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List l = new ArrayList();

		l.add(10); // run
		l.add("deepak");
		l.add("rahul");
		
		System.out.println(l);

		ListIterator itr = l.listIterator();
		
		//itr.next(); //cursor move 
		//itr.next();
		//itr.next();	
			
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		
		System.out.println("...................");
		
		while (itr.hasPrevious()) {

			System.out.println(itr.previous());

		}

	}

}
