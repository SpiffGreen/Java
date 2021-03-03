import java.util.*;
public class SortNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of times to input values: ");
    int len = input.nextInt();
    int[] arr = new int[len];
    for(int i = 0; i < len; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}