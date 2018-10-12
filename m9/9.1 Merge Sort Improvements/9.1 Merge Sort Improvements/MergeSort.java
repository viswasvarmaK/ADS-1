/**.
 * Class for merge sort.
 */
class MergeSort {
    /**
     * { declaring cutoffpoint to 7 }
     */
    private static int cutoffpoint = 7;
    /**
     * { this method merges the array from sort function in sorted form }
     * time complexity for this method is N because the for loop executes for N times.
     *
     * @param      a     { Comparabale array }
     * @param      aux   The auxiliary
     * @param      low   The low
     * @param      mid   The middle
     * @param      high  The high
     */
    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {
        // assert isSorted(a, low, mid);
        // assert isSorted(a, mid + 1, high);
        // for (int k = low; k <= high; k++) {

        //  aux[k] = a[k];
        // }
        int i = low, j = mid + 1;
        for (int k = low; k <= high ; k++) {
            if (i > mid)                aux[k] = a[j++];
            else if (j > high)          aux[k] = a[i++];
            else if (less(a[j], a[i]))  aux[k] = a[j++];
            else                        aux[k] = a[i++];
        }
        //assert isSorted(a,low,high);
    }
    /**
     * { this method divides the given array into sub arrays }
     * the time complexity is for this method is logN because it is recursive method
     * called N times which is linear and similary to logN.
     * @param      a     { parameter_description }
     * @param      aux   The auxiliary
     * @param      low   The low
     * @param      high  The high
     */
    private static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
        if (high <= low + cutoffpoint) {
            //System.out.println("void sort");

            Insertionsort.sort(aux, low, high);
            System.out.println("Insertion sort method invoked...");
            return ;
        }
        //System.out.println();
        int mid = low + (high - low) / 2;
        sort(aux, a, low, mid);
        sort(aux, a, mid + 1, high);
        if (less(a[mid + 1], a[mid])) {
            //System.out.println("Array is already sorted. " +
            // "So, skipped the call to merge...");

            merge(a, aux, low, mid, high);
        } else {
            System.out.println("Array is already sorted. " + "So, skipped the call to merge...");
            System.arraycopy(a, low, aux, low, high - low + 1);
            return;
        }
    }
    /**
     * { sort method creates comparable array of name aux of length equal to comparable array a call sort function which is to be over ride }
     *
     * @param      a     { comparable type}
     */
    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
    }
    /**
     * { compares two objects }
     * time complexity is 1 because only one statement is execute at one time
     *
     * @param      i     { Comparable value}
     * @param      j     { Comparable value }
     *
     * @return     { returns true if it satisfies the condition else returns false}
     */
    private static boolean less(final  Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
}
