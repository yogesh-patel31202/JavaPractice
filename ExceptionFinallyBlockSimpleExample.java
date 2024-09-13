import java.util.Scanner;

public class ExceptionFinallyBlockSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int length_of_array;
		length_of_array=sn.nextInt();
		int[] array = new int[length_of_array];
			int a=0;
			for(int i=0; i<array.length; i++) {

				a=a+2;
				array[i]=a;
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
		finally {
			sn.close();
			System.out.println("Resources are closed.");
		}
	}	
	
}
