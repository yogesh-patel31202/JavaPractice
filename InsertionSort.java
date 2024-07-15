
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 1, 6, 2, 4, 3 };
		
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < a.length; i++){  
                    System.out.print(a[i] + " ");  
            }  
            System.out.println();  
              
			  
	int temp, j;
	for (int i = 1; i < a.length; i++) {
		temp = a[i];		//temp=a[1]	
		j = i;				//j=1
		while (j > 0 && a[j - 1] > temp) {	//1>0&&a[1-1]>a[1] 
									//1>0&&5>1	condition true		
			a[j] = a[j - 1];//swaping of 5 and 1
			j--;//j-- =0
		}
		a[j] = temp;
	}
    System.out.println("Array Before after Sort"); 		
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}

	}

}
