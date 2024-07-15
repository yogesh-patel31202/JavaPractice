public class ReplacingRemovingCharactersInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "this is demo";
		
		System.out.println(s1.replace("is", "was"));// thwas was demo

		System.out.println(s1.replaceFirst("is", "was"));// thwas is demo
		System.out.println(s1.replaceAll("is(.)", "was"));// thwaswasdemo-rejex
		System.out.println(s1.replace("is(.)", "was"));// thwas was demo
		System.out.println(s1.replaceAll("is(.*)", "was"));// thwas-rejex

	}

}