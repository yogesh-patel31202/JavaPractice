import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExampleClass {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			Vector v = new Vector();

			v.add(15);
			v.add("Yogesh");
			v.add(20);

			System.out.println(v);

			Enumeration e = v.elements();

			while (e.hasMoreElements()) {

				System.out.println(e.nextElement());

		}
	}
}


