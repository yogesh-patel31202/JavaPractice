import java.util.Scanner;
public class NestedIf{
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int num1,num2,num3;
	System.out.print("Enter the first number = ");
	num1=scan.nextInt();
	
	System.out.print("Enter the second number = ");
	num2=scan.nextInt();
	
	System.out.print("Enter the third number = ");
	num3=scan.nextInt();
	
	
	if(num1>num2){
		if(num1>num3){
			System.out.println(num1+" is greate number");
		}else{
			System.out.println(num3+" is greate number");
		}
	}
	if(num2>num1){
		if(num2>num3){
			System.out.println(num2+" is greate number");
		}else{
			System.out.println(num3+" is greate number");
		}
	}
	}
}