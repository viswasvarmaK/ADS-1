/**.
 * Class for insertionsort.
 */
class Insertionsort {
    /**
     * { sorts all the elements in comparable array }
     * time complexity is N**2. Because inner forloop executes for N times and outer for loop also executes for N times.
     * @param      a     { Comparable array }
     */
    public static void sort(final Comparable[] a) {
        int N = a.length;
        for (int i = 0 ; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exchange(a, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    /**
     *This sort methods overrides the above sort method.
     * { sort method for Insertion sort. It sorts all the elements in asscending order }
     * Complexity : N**2.The complexity for less method is 1
     * and exhcnge method is 1 and inner loop iterates for N times and
     * outer loop iterates for another N times so overall time complexity is N**2.
     * @param      a     { comparable array }
     */
    public static void sort(final Comparable[] a, final int low, final int high) {
        //
        //int N = a.length;
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low; j--) {
                if (less(a[j], a[j - 1])) {
                    exchange(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    /**
     * { checks if the j th index element is less than or not with jth element }
     *
     * @param      i     { ith index element of a }
     * @param      j     {jth  index element of a }
     *complexity is 1 because the only one statement is executed.
     * @return     { returns true if condition statisfies}
     */
    private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    /**
     * { exchanges the elements in ith index with jth indexd}
     *The time complexity is 1. Because the statements in this method are executed only once.
     * @param      a     { comparable array }
     * @param      i     { index of a }
     * @param      j     { index of a }
     */
    private static void exchange(final Comparable[] a,
                                 final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}