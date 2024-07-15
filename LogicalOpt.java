public class LogicalOpt{
	public static void main(String[]args){
		int a=1;
		int b=0;
		System.out.println(a>b&&b>a); //and operator ....dono condition true hona chahiye 
		System.out.println(a>b||b>a); //Or operator ....ek condition true hona chahiye dono mese
		System.out.println(!(a>=b));
		//(!(a<=b)) NOte operator ....condition true hone par false and false hone par true
	}
}
