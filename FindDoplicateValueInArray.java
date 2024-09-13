import java.util.ArrayList;
import java.util.Scanner;

public class FindDoplicateValueInArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array: ");
    int length = sc.nextInt();
    int[] arr = new int[length];
    System.out.println("Enter element of array : ");
    for (int i = 0; i < length; i++) {
      System.out.print("Enter value of " + (i + 1) + " element: ");
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.print("Array element : ");
    for (int element : arr) {
      System.out.print(element + " ");
    }

    ArrayList<Integer> Result = findDoplicateValueInArray(arr);
    System.out.print("Duplicate value in arr : ");
    for (int value : Result) {
      System.out.print(value + " ");
    }
  }

  public static ArrayList<Integer> findDoplicateValueInArray(int[] arr) {
    ArrayList<Integer> duplicateValue = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          duplicateValue.add(arr[i]);
        }
      }

    }
    return duplicateValue;
  }
}
