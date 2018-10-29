/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object. for Solution class
     */
    private Solution() {

    }
    /**.
     * main function to calculate running median
     *  TIme complexity is N as it takes n number of inputs
     *   and for loop itarates till n times.
     *@author Teja
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MinPQ<Float> minpq = new MinPQ<Float>(n);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(n);
        float median = 0.0f;
        for (int i = 0; i < n; i++) {
             float k = scan.nextFloat();
            if (k > median) {
                minpq.insert(k);
                //System.out.println("minpq" );
            } else {
                maxpq.insert(k);
                //System.out.println("maxpq" );
            }
            if (maxpq.size() - minpq.size() > 1) {
                float x = maxpq.delMax();
                //System.out.println("x .." +x);
                minpq.insert(x);
                //System.out.println("minpq..." );
            }
            if (minpq.size() - maxpq.size() > 1) {
                float y = minpq.delMin();
                //System.out.println("y..." +y);
                maxpq.insert(y);
                //System.out.println("maxpq...");
            }
            if (minpq.size() == maxpq.size()) {
                median = (minpq.min() + maxpq.max()) / 2;
                //System.out.println("median1");
                System.out.println(median);
            }
            if (maxpq.size() > minpq.size()) {
                median = maxpq.max();
                //System.out.println("median2");
                System.out.println(median);
            }
            if (minpq.size() > maxpq.size()) {
                median = minpq.min();
                //System.out.println("median3");
                System.out.println(median);
            }

        }
    }
}
