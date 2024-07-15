
public class ExceptionExampleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
			int a=1;
			for(int i=0; i<array.length; i++) {
				array[i]=a;
				a=a*3;
			}
		
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		try {
		      
		      System.out.println(array[11]);	//Risky code
		    } 
		catch (Exception e)
			{
		      System.out.println("Index not available.");	//handling code
		      System.out.println("Exception detail: "+e);//Exception detail
			} 
	}
}
