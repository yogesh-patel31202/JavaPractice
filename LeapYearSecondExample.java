class LeapYearSecondExample{
public static void main(String []args){
	int year =2012;
		if((year%400==0)|| (year%4==0 && year%100!=0)){
			System.out.println("yaer is leap");
		}
		else{
			System.out.println("not leap year");
		}
	}
}
