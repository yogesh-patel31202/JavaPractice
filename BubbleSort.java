
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] ={3,60,35,2,45,320,5};  //1D array create 
        
        System.out.println("Array Before Bubble Sort");  
        
        for(int i=0; i < arr.length; i++){  //using for loop printing array elements
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
                 int n = arr.length;		// n is a array length
                 int temp = 0;			 	
                 for(int i=0; i < n; i++){	//indexing is from 0 and end n-1
         for(int j=1; j < (n-i); j++){		//index 0 wale element ko chhod kar
                  if(arr[j-1] > arr[j]){  	//checking 0 index and 1 index value
                     //condition is true 						  
                         temp = arr[j-1];  //swap elements index 0 and 1
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                }      
         	}  
        }     
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++) //Print sorted array
        {  
                System.out.print(arr[i] + " ");  
        }  

	}

}
