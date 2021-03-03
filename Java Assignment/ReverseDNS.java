import java.util.*


public class ReverseDNS {

    public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter Domain Name: ");

      String domain = input.nextLine();

      String[] splitted = strSplit(domain);

      String[] reversedSplit = new String[splitted.length];

      for(int i = splitted.length - 1, int j = 0; i >= 0, j < splitted.length; i--, j++) {

          reversedSplit[j] = splitted[i];

      }
      string final = strJoin(reversedSplit);

      System.out.println("Reversed DNS: " + final);

    }

    
    public static String[] strSplit(String dns) {

        String[] final = new String[dns.length];

        String temp = "", selector = ".";

        for(String x: dns) {

            if(x == selector) {

                final.push(temp);

            } else {

                temp += x;

            }

        }

        return final;

    }

    public static String strJoin(String[] arr) {

        String final = "", selector = ".";

        for(int i = 0; i < arr.length; i++) {

            if(i != arr.length -1) {

                final += arr[i] + selector;

            } else {

                final += arr[i];

            }

        }

        return final;

    }

}