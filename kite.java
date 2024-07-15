public class Kite{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			for(int j=6;j>=i*2;j--){
				System.out.print("_");
			}
			for(int j=2;j<=i*2;j++){
				System.out.print("*");				
			}
			for(int j=3;j<=i*2;j++){
				System.out.print("*");				
			}
			
			System.out.println();
		}
		for(int i=1;i<=6;i++){	
			for(int j=2; j<=i;j++){
				System.out.print("_");
			}
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i=1;i<=3;i++){
			for(int j=5;j>=i+1;j--){
				System.out.print("_");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			
			System.out.println("");
		}
		
	}
}