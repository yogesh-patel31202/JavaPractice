public class NamingConvention{
	public static void main(String []args){
		/*1)	Type 1 Classes and interfaces: Class and interface name should be noun.
				*First letter capitalized.
			Example: NamingConvention.

		2)	Type 2 Method: Method name should be verb.
				*First letter lowercase.
			Example: additionOfTwoNumber.

		3)	Type 3 Variable: Should meaningful and short. 
				*all lowercase letter , $ ,_ .
			Example: num_one,
			*/
			NamingConvention nc=new NamingConvention();
			nc.additionOfTwoNumber();
		}
		void additionOfTwoNumber(){		
		int num_one=10;
		int num_two=20;
		int sum=num_one+num_two;
		System.out.println("The sum of "+num_one+" and "+num_two+" is: "+sum);
	}
}