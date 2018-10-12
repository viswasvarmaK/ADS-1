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
	 * time complexity for this method is N because the two for loops execute seperately N times.
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
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		int i = low, j = mid + 1;
		for (int k = low; k <= high ; k++) {
			if (i > mid) a[k] = a[j++];
			else if (j > high) a[k] = a[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = a[i++];
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
		if (high <= low+cutoffpoint){
			//System.out.println("void sort");

			Insertionsort.sort(a,low,high+1);
			System.out.println("Insertion sort method invoked...");
			return ;
		} 
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid);
		sort(a, aux, mid + 1, high);
		if(!less(a[mid+1],a[mid])){
			for (int i = low; i <= high; i++) {
            aux[i] = a[i];
            }
            System.out.println("Array is already sorted. " +
                "So, skipped the call to merge...");
            return ;
		}  
		merge(a, aux, low, mid, high);
	}
	/**
	 * { sort method creates comparable array of name aux of length equal to comparable array a call sort function which is to be over ride }
	 *
	 * @param      a     { comparable type}
	 */
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
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