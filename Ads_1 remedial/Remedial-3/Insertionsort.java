/**.
 * Class for insertionsort.
 */
class Insertionsort {
	/**
	 * { sort method for Insertion sort. It sorts all the elements in asscending order }
	 * Complexity : N**2.The complexity for less method is 1
	 * and exhcnge method is 1 and inner loop iterates for N times and
	 * outer loop iterates for another N times so overall time complexity is N**2.
	 * @param      a     { comparable array }
	 */
	public static void sort(final Student[] a,final int size) {
		// 
		int N = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j-1])) {
					exchange(a, j, j-1);
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
	private static boolean less(final Student i, final Student j) {
        return i.getmarks().compareTo(j.getmarks()) < 0;
    }
    /**
     * { exchanges the elements in ith index with jth indexd}
     *The time complexity is 1. Because the statements in this method are executed only once.
     * @param      a     { comparable array }
     * @param      i     { index of a }
     * @param      j     { index of a }
     */
    private static void exchange(final Student[] a,
        final int i, final int j) {
        Student swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}