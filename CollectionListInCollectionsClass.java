import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionListInCollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();

		l.add(10); // run
		l.add(1, 20);
		l.add(2, 10);
		l.add(null);
		l.add(null);
		// l.add(0, 10);
		// l.add(1, 10); //not run

		System.out.println(l);

		Iterator itr = l.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		
		
		ListIterator itr1 = l.listIterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());

		}

	}

}
