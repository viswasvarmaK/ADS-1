/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object for solution class
     * @author Viswas
     */
    private Solution() {

    }
    /**.
     * main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchST<String, Integer> binarysearch
                                      = new BinarySearchST<String, Integer>();
        String[] token = scan.nextLine().split(" ");
        for (int i = 0; i < token.length; i++) {
            binarysearch.put(token[i], i);
        }
        while (scan.hasNext()) {
            String[] input = scan.nextLine().split(" ");
            switch (input[0]) {
            case "max" :
                System.out.println(binarysearch.max());
                break;
            case "floor" :
                System.out.println(binarysearch.floor(input[1]));
                break;
            case "rank" :
                System.out.println(binarysearch.rank(input[1]));
                break;
            case "deleteMin" :
                binarysearch.deleteMin();
                break;
            case "contains" :
                System.out.println(binarysearch.contains(input[1]));
                break;
            case "keys" :
                System.out.println(binarysearch.toString());
                break;
            case "get" :
                System.out.println(binarysearch.get(input[1]));
            default:
                break;
            }
        }
    }
}
