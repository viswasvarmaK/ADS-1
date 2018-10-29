/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * class for Solution
 */
public final class Solution {
    /**.
     * default constructor
     * @author Viswas
     */
    private Solution() {

    }
    /**
     * main mehtod which describes the operations of steque
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < testcases; i++) {
            Steque ss = new Steque();
            while (scan.hasNext()) {
                String line = scan.nextLine();
                if (line.length() == 0) {
                    System.out.println();
                    break;
                }
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                case "pop":
                    ss.pop();
                    System.out.println(ss);
                    //ss.toString();
                    //System.out.println();
                    break;
                case "enqueue":
                    ss.enqueue(tokens[1]);
                    System.out.println(ss);
                    //ss.toString();
                    //System.out.println();
                    break;
                // //System.out.println();
                case "push" :
                    ss.push(tokens[1]);
                    System.out.println(ss);
                    //ss.toString();
                    //System.out.println();
                    break;
                default:
                    break;
                }
            }
        }
    }
}
