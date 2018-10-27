/**
 * Solution file.
 */
import java.util.Scanner;
/**
 Solution class.
 */
final class Solution {
  /**
   default constructor.
   */
  private Solution() {
  }
  /**
   * Main method.
   * @param args String type.
   */
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    SeparateChainingHashST<Integer, StudentData> hash;
    hash = new SeparateChainingHashST<>();
    for(int i = 0; i < n; i++) {
      String[] tokens = sc.nextLine().split(",");
      StudentData obj = new StudentData(tokens[1], Double.parseDouble(tokens[2]));
      hash.put(Integer.parseInt(tokens[0]), obj);
    }
    int queries = Integer.parseInt(sc.nextLine());
    for (int j = 0; j < queries; j++) {
      String[] queryTokens = sc.nextLine().split(" ");
      if(queryTokens[0].equals("get")) {
        if(Integer.parseInt(queryTokens[2]) == 1) {
          if (hash.get(Integer.parseInt(queryTokens[1])) == null) {
            System.out.println("Student doesn't exists...");
          } else {
            System.out.println(hash.get(Integer.parseInt(queryTokens[1])).getName());
          }
        } else {
          if (hash.get(Integer.parseInt(queryTokens[1])) == null) {
            System.out.println("Student doesn't exists...");
          } else {
            System.out.println(hash.get(Integer.parseInt(queryTokens[1])).getMarks());
          }
        }
      }
    }
  }
}