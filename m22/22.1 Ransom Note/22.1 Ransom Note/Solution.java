/**.
 * imports scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {

    /**.
     * Constructs the object
     * @author Viswas
     */
    private Solution() {

    }
    /**.
     * { main function to check if the magzine words and
     * notes words are same or not }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int magzinewords = scan.nextInt();
        int notewords = scan.nextInt();
        SeparateChainingHashST<String, Integer> st =
            new SeparateChainingHashST();
        scan.nextLine();
        String[]magzine = scan.nextLine().split(" ");
        String[] note = scan.nextLine().split(" ");
        for (int i = 0; i < magzinewords; i++) {
            if (st.contains(magzine[i])) {
                int count = st.get(magzine[i]);
                st.put(magzine[i], count + 1);
            } else {
                st.put(magzine[i], 1);
            }
        }
        boolean flag = true;
        for (int i = 0; i < notewords; i++) {
            if (st.contains(note[i])) {
                int count = st.get(note[i]);
                if (count == 0) {
                    flag = false;
                    break;
                }
                st.put(note[i], count - 1);
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
