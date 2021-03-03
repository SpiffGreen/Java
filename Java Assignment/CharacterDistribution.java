import java.util.*;

class CharFreq {
  char data;
  int freq;
  CharFreq(char letter) {
    data = letter;
    freq = 1;
  }
}

public class CharacterDistribution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter text: ");
    String word = input.nextLine();
    input.close();
    // CharFreq[] obj = new CharFreq[]
    ArrayList<CharFreq> obj = new ArrayList<CharFreq>();
    String temp = "";
    for(int i = 0; i < word.length(); i++) {
      if(temp.indexOf(word.charAt(i)) <= -1) {
        obj.add(new CharFreq(word.charAt(i)));
        temp += word.charAt(i);
      } else {
          for(CharFreq x: obj) {
            if(x.data == word.charAt(i)) {
              x.freq += 1;
            }
        }
      }
    }
    for(CharFreq x: obj) {
      System.out.print(x.data);
      System.out.print(" ");
      System.out.print(x.freq + "\n");
    }

    // Sorted
    Collections.sort(obj, new Comparator<CharFreq>() {
      public int compare(CharFreq c1, CharFreq c2) {
        return c2.freq - c1.freq;
      }
    });

    System.out.println("Sorted Below");

    for(CharFreq x: obj) {
      System.out.print(x.data);
      System.out.print(" ");
      System.out.print(x.freq + "\n");
    }
  }
}