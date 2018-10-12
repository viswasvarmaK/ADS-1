/**.
 * { imports Scanner package }
 * @author Viswas
 */
import java.util.Scanner;
/**.
 * { imports Arrays package }
 */
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object for solution.
     */
    private Solution() {

    }
    /**.
     * { main function }reading input from the user.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] str = scan.nextLine().split(",");
            //for(int i = 0; i<=10; i++)
            //System.out.println(" String Arrays" +str[i]);
            MergeSort.sort(str);
            System.out.println(Arrays.toString(str));
            System.out.println();
        }
    }
}
