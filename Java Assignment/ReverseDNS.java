import java.util.*;

public class ReverseDNS {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Domain Name: ");
    String domain = input.nextLine();
    input.close();
    String[] tokens = domain.split("[.]+");
    String[] reversedTokens = new String[tokens.length];
    int count = tokens.length - 1;
    for(String x: tokens) {
      reversedTokens[count--] = x;
    }
    String result = String.join(".", reversedTokens);
    System.out.println("Reversed Domain Name: " + result);
  }
}
