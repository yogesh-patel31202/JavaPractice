import java.util.Scanner;
public class SwitchCaseCal{
	public static void main(String []args){
Scanner scan=new Scanner(System.in);
int a,b,ans;
String expression;

	System.out.println("Enter the first number : ");
		a=scan.nextInt();
	System.out.println("Enter the second number : ");
		b=scan.nextInt();
	System.out.println("Enter the operator : ");
expression = scan.next();

switch(expression){
case"+":{
ans=a+b;
System.out.println("The sum of "+a+" and "+b+" is : "+ans);
break;
}

case"-":{
ans=a-b;
System.out.println("The Substraction of "+a+" and "+b+" is : "+ans);
break;
}

case"*":{
ans=a*b;
System.out.println("The multiplication of "+a+" and "+b+" is : "+ans);
break;
}

case"/":{
ans=a+b;
System.out.println("The division of "+a+" and "+b+" is : "+ans);
break;
}
default:{
System.out.println("Maths error!");
break;
			}
		}
	}
}
