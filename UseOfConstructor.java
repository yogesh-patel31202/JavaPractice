public class UseOfConstructor {

	String name;
	int stu_id;

	UseOfConstructor(String name, int stu_id) {
		this.name = name;
		this.stu_id = stu_id;
	}
	public static void main(String[] args) {

		UseOfConstructor UOC1 = new UseOfConstructor("deepak", 1);
		UseOfConstructor UOC2 = new UseOfConstructor("Raj", 2);

          UOC1.name = "raj";
		UOC1.stu_id = 10;
		UOC1.name = "raj Verma";
		UOC1.stu_id = 11;
			}
}
