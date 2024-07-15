
public class ForLoopLeftTriangleStarPattern {

	public static void main(String args[])   
	{    
	//i for rows and j for columns      
	//i<=5 number of row print karvane ke liye  
	int i, j, row = 6;       
	//Outer loop for number of rows. 
	for (i=1; i<=5; i++)   
	{  
	//inner loop  for print space.
	for (j=2*(row-i); j>=1; j--)         
	{  
	//prints space between two stars(columns)      
	System.out.print(" ");   
	}   
	//columns me star print karne ke liye inner loop he   
	for (j=1; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("* ");       
	}   
	//ek row print karne ke bad next line ke liye  
	System.out.println();   
	}   
	}  
}
