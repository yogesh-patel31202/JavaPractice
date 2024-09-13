import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIteratorClass {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();

		l.add("10"); // run
		l.add("deepak");
		l.add("rahul");
		
		System.out.println(l);

		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		
		l.remove("rahul");
		System.out.println(l);
		l.add("raj");
		System.out.println(l);
	
	}

}
