public class SingleDimensionArray {
	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30, 40 };
			System.out.println(a);
			System.out.println(a[0]);
			System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
}