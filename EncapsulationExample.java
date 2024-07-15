
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bill obj = new Bill();	
		
			obj.setBil_no(1);
			
		System.out.println(obj.getBil_no());

	}

}

class Bill {

	private int bil_no;

	public void setBil_no(int bil_no1) {

		bil_no = bil_no1;

	}

	public int getBil_no() {

		return bil_no;

	}

}
