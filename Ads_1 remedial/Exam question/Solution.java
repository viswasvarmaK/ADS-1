import java.util.*;

public class Solution{
  Solution(){

  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    int length = input.length();
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < length; i++) {
      char char1 = input.charAt(i);
      if (char1 == '+') {
        int x = stack.pop();
        int y = stack.pop();
        int z = y + x;
        stack.push(z);
      } else if (char1 == '-'){
        int x = stack.pop();
        int y = stack.pop();
        int z = x - y;
        stack.push(z);
      } else if (char1 == '*'){
        int x = stack.pop();
        int y = stack.pop();
        int z = x * y;
        stack.push(z);

      } else {
        stack.push(Integer.parseInt(String.valueOf(char1)));
      }
    }
    System.out.println(stack.peek()); 
  }
}

// import java.util.*;

// public class Solutionsstt {

//   Solutionsstt() {

//   }
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     String input = scan.nextLine();
//     int a = 0;
//     int b = 0;
//     int c= 0;
//     Queue<Integer> queue = new Queue<Integer>();
//     for (int i = 0; i < input.length(); i++) {
//       // queue.enqueue(Integer.parseInt(String.valueOf(input.charAt(i))));
//       if (input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*') {
//         a = queue.dequeue();
//         b = queue.dequeue();
//       } else {
//       queue.enqueue(Integer.parseInt(String.valueOf(input.charAt(i))));
//     }
//       if (input.charAt(i) == '+') {
//         c = a + b;
//       }
//       if (input.charAt(i) == '-') {
//         c = a - b;
//       }
//       if (input.charAt(i) == '*') {
//         c = a * b;
//       } 
        
//     }
//     System.out.println(c);
//   }

// }