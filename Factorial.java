import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    long number = sc.nextInt();
    sc.close();
    int result = 1;
    if (number == 0) {
      result = 0;
    } else {
      for (int i = 1; i <= number; i++) {
        result = i * result;
      }
    }
    System.out.println("Factorial of " + number + " is : " + result);
  }
}
