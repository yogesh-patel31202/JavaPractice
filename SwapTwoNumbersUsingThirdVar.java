import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first num : ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second num : ");
    int num2 = sc.nextInt();
    sc.close();

    int temp = num2;
    num2 = num1;
    num1 = temp;
    System.out.println("<-- After swaping -->");
    System.out.println("Value of first num :" + num1);
    System.out.println("Value of second num :" + num2);
  }
}
