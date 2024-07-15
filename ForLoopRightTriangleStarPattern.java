
public class ForLoopRightTriangleStarPattern {

	public static void main(String args[])   
	{   
	//i for rows and j for columns      
	//i<=5 number of row print karvane ke liye 
	int i, j;   
	//i row print print karne ke liye outer loop he 
	for(i=1; i<=5; i++)   
	{   
	//columns me star print karne ke liye inner loop he  
		for(j=1; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   

	System.out.println();  
	//ek row print karne ke bad next line ke liye 
	}   
	}
}
