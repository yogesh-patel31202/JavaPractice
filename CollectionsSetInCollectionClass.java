import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSetInCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(100);
		s.add(null);
		s.add(null);

		System.out.println(s);

		Iterator itr = s.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
