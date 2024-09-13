class SumOfTwoArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 4, 5 };

    if (arr1.length == arr2.length) {
      SumOfTwoArray obj = new SumOfTwoArray();
      int[] result = obj.sumOfArry(arr1, arr2);
      System.out.print("Sum of arrys : ");
      for (int value : result) {
        System.out.print(value + " ");
      }
    } else {
      System.out.println("Both arrays must be of same length");
    }
  }

  public int[] sumOfArry(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i] + arr2[i];
    }
    return result;
  }
}