public class Star{
	public static void main(String[]args){
		
		for(int i=1; i<=3; i++){
			for(int j=1;j<=5;j++){
				System.out.print("_");
			}
			for(int j=2;j>=i;j--){
				System.out.print("-");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");				
			}
			for(int j=2;j<=i;j++){
				System.out.print("*");				
			}
			System.out.println();
		}

		for(int i=1; i<=3; i++){
			for(int j=2;j<=i;j++){
				System.out.print("-");				
			}
			for(int j=1;j<=11;j++){
				System.out.print("*");
			}
			for(int j=1;j>=i-1;j--){
				System.out.print("*");				
			}
			for(int j=1;j>=i-1;j--){
				System.out.print("*");				
			}
			System.out.println();
		}
		for(int i=1; i<=2; i++){
			for(int j=1;j>=i;j--){
			System.out.print("_");				
			}
			for(int j=1;j<=13;j++){
				System.out.print("*");
			}
			for(int j=2;j<=i;j++){
				System.out.print("*");
			}
			for(int j=2;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}	
		for(int i=1; i<=3; i++){
			for(int j=1;j<=5;j++){
				System.out.print("_");
			}
			for(int j=2;j<=i;j++){
				System.out.print("-");
			}
			for(int j=1;j>=i-2;j--){
				System.out.print("*");
			}
			for(int j=1;j>=i-1;j--){
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}