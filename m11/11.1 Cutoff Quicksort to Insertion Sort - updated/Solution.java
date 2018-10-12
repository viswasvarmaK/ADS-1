
/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * imports Arrays package
 */
import java.util.Arrays;
/**
 * Class for solution.
 * 
 */
public final class Solution {
    /**.
     * Constructs the object for class solution
     * @author teja
     */
    private Solution() {

    }
    /**.
     * main funciton
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testcases; i++) {
            int cutoff = Integer.parseInt(scan.nextLine());
            //System.out.println("cutoff ......" + cutoff);
            String[] tokens = scan.nextLine().split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                Quicksort.sort(tokens, cutoff);
                System.out.println(Arrays.toString(tokens));
            }
        }
    }
}
