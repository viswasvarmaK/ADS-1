/**.
 * { imports Scanner package }
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     * @author Viswas
     */
    private Solution() {

    }
    /**.
     * main method to perform operations
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchT<Book, Integer> binarysearch = new BinarySearchT<>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                binarysearch.put(new Book(tokens[1], tokens[2],
                                           Double.parseDouble(tokens[2 + 1])),
                                  Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                System.out.println(binarysearch.get(new Book(
                        tokens[1], tokens[2],
                        Double.parseDouble(
                            tokens[2 + 1]))));
                break;
            case "max":
                System.out.println(binarysearch.max());
                break;
            case "min":
                System.out.println(binarysearch.min());
                break;
            case "floor":
                System.out.println(binarysearch.floor(
                                       new Book(tokens[1], tokens[2],
                                                Double.parseDouble(
                                                    tokens[2 + 1]))));
                break;
            case "ceiling":
                System.out.println(binarysearch.ceiling(
                                       new Book(tokens[1], tokens[2],
                                                Double.parseDouble(
                                                    tokens[2 + 1]))));
                break;
            case "select":
                System.out.println(binarysearch.select(
                                       Integer.parseInt(tokens[1])));
                break;
            case "delete":
                binarysearch.delete(new Book(tokens[1], tokens[2],
                                    Double.parseDouble(tokens[2 + 1])));
                break;
            case "deleteMax":
                binarysearch.deleteMax();
                break;
            case "deleteMin":
                binarysearch.deleteMin();
                break;
            default:
                break;
            }
        }
    }
}
