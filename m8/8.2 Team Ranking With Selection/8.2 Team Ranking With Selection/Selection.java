/**.
 * Class for selection.
 */
class Selection	{
	/**
	 * { compares two elements in an array }
	 *
	 * @param      element1  The element 1 of comparable type
	 * @param      element2  The element 2 of comparable type
	 * complexity 1
	 * @return     { returns -1 if it staisfies conditon else returns 1}
	 */
	public boolean LessThan(Comparable element1, Comparable element2) {
		return element1.compareTo(element2) < 0;
	}
	/**
	 * { exchanges two elements in comparable array }
	 * complexity 1
	 * @param      a       { comparable array}
	 * @param      index1  The index 1 of array
	 * @param      index2  The index 2 of array 
	 */
	public void exchange(Comparable []a, int index1, int index2) {
		Comparable temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	/**
	 * { sorts all the elements in array }
	 * complexity N**2
	 */
	public void sort(Comparable a[]) {
		// Comparable min = a[i];
		int N = a.length;
		for(int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (LessThan(a[j], a[j-1])) {
					exchange(a, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}
	// public int min(Comparable []a, int i) {
	// 	Comparable min = a[i];
	// 	int minIndex = i;
	// 	for (i = i+1; i < a.length; i++) {
	// 		if (LessThan(a[i], min)) {
	// 			min = a[i];
	// 			minIndex = i;
	// 		}
	// 	}
	// 	return minIndex;
	// }
}	