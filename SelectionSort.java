
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 38, 52, 9, 18, 6, 62, 13 };
		// String[] a = { "deepak","sumit","amit","raj","sandeep"};
		
		        System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
                System.out.println();  
                  
		int min;
		int temp=0;
		// String temp;
		for (int i = 0; i < a.length; i++) {
			min = i;	//min=0
			for (int j = i+1; j < a.length; j++) {
				// if (a[j].compareTo(a[j+1])>0) { equeal =0,less=-1,grat=1;
				if (a[j] < a[min]) {	//a[1]<a[0] condition false
					min = j;	
				}
			}	
			temp = a[i];	//temp=a[0]=38
			a[i] = a[min];	//a[0]=a[0] 
			a[min] = temp;	//a[0]=temp=38 in first round
		}
		
        System.out.println("Array Before after Sort"); 
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
