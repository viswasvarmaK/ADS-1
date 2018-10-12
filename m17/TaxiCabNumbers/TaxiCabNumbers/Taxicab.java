/**.
 * Class for taxicab.
 */
public class Taxicab implements Comparable<Taxicab> {
    /**.
     * integer i
     */
    private int i;
    /**.
     * integer type j
     */
    private int j;
    /**.
     * sum of long type
     */
    private long sum;
    /**.
     * Constructs the object for taxi cab
     *
     * @param      i1     { integer parameter }
     * @param      j1     { integer parameter }
     */
    public Taxicab(final int i1, final int j1) {
        this.sum = (long) (i1 * i1 * i1) + (j1 * j1 * j1);
        this.i = i1;
        this.j = j1;
    }
    /**.
     * compares two objects
     * Time complexity is 1 because each statement is executed only once.
     * @param      that  The that
     *
     * @return     { returns 1 if this.sum > that.sum
     * and this.i > that.i else returns -1}
     */
    public int compareTo(final Taxicab that) {
        if (this.sum > that.sum) {
            return +1;
        }
        if (this.sum < that.sum) {
            return -1;
        }
        if (this.i > that.i) {
            return +1;
        }
        if (this.i < that.i) {
            return -1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     * TIme complexity is 1 as one statement is executed only once
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + " = " + i + "^3 + " + j + "^3";
    }

    /**.
     * finds the taxi cab number
     * Time complexity is N as for loop is executed for N times
     * @param      n1     { number of occurance of the taxi cab number}
     * @param      m1     { number of pairs that we needed}
     *
     * @return     { returns the taxicab number }
     */
    public static long findTaxicab(final int n1, final int m1) {
        MinPQ<Taxicab> minPQ = new MinPQ<Taxicab>();
        final int n = 600;
        int count = 0;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            minPQ.insert(new Taxicab(i, i));
        }

        Taxicab prev = new Taxicab(0, 0);

        int run = 1;
        while (!minPQ.isEmpty()) {
            Taxicab curr = minPQ.delMin();
            if (prev.sum == curr.sum) {
                run = run + 1;
                if (run == m1) {
                    count++;
                    if (count == n1) {
                        res = curr.sum;
                        break;
                    }
                }
            } else {
                run = 1;
            }
            if (curr.j < n) {
                minPQ.insert(new Taxicab(curr.i, curr.j + 1));
            }
            prev = curr;
        }
        return res;
    }
}
