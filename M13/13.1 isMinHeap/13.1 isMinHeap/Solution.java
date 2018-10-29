/**.
 * impors scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 *
 */
public final class Solution  {
    /**.
     * Constructs the object for Solution
     * @author Viswas
     */
    private Solution() {

    }
    /**.
     * main function which is used to see if
     * the heap is Minheap or not
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        switch (key) {
        case "String":
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                MinPQ<String> data = new MinPQ<String>(token);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Integer" :
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                Integer[] integerarray = new Integer[token.length + 1];
                for (int i = 0; i < token.length; i++) {
                    integerarray[i + 1] = Integer.parseInt(token[i]);
                }
                MinPQ<Integer> data = new MinPQ<Integer>(integerarray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Float" :
            while (n > 0) {
                String input = scan.nextLine();
                if (input.equals("")) {
                    System.out.println("false");
                    break;
                }
                String[] token = input.split(",");
                Float[] floatarray = new Float[token.length + 1];
                for (int i = 0; i < token.length; i++) {
                    floatarray[i + 1] = Float.parseFloat(token[i]);
                }
                MinPQ<Float> data = new MinPQ<Float>(floatarray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Double" :
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                Double[] doublearray = new Double[token.length + 1];
                for (int i = 0; i < token.length; i++) {
                    doublearray[i + 1] = Double.parseDouble(token[i]);
                }
                MinPQ<Double> data = new MinPQ<Double>(doublearray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        default:
            break;
        }
    }
}
