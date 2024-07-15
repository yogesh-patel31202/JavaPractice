import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("ajay");
		al.add('c');

		// collection object Create(Implemented Class ka object create kar sakte
		// hai) property,working diff

		HashSet hs = new HashSet();

		hs.add("Yogesh");
		hs.add(20);
		hs.add(true);

		// collection object Create working diff

		List l = new ArrayList();
		List l2 = new LinkedList();

		Set l3 = new HashSet();//interface ka refrance create karke ArrayList ke object ko point karva sakte hai,
	
	HashMap hm=new HashMap();
	
	hm.put(101, "deepak");
	hm.put(102, "Yogesh");
	hm.put(103, "amit");

	System.out.println("Data Put successful");
	}

}
