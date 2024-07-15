//Swap Program  (without third variable)
public class SwapWithoutVariable{
	public static void main(String []args){
int a=10,b=20;
b=a+b;  //sum 10+20
a=b-a;	//a=30-10
b=b-a;	//b=30-20
System.out.println("after value of a="+a);
System.out.println("after value of b="+b);
}
}
