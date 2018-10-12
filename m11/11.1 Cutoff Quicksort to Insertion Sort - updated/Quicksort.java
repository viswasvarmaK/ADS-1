/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * imports Array package
 */
import java.util.Arrays;
/**.
 * Class for quicksort.
 */
class Quicksort {
	/**
	 * partion method. It partions the array according to pivot number
	 * Time COmplexity is N because it is a recurssive function that is called N times
	 * @param      a     { comparable array}
	 * @param      low   The low of int type
	 * @param      high  The high of int type
	 *
	 * @return     {returns the index of comparable arry of type int  }
	 */
	private static int partion(Comparable[] a, int low , int high) {
		int i = low, j = high + 1;
		while (true) {
			while (less(a[++i], a[low])) // find item on left toswap
				if (i == high) break;
			while (less(a[low], a[--j])) // find item on right to swap
				if (j == low) break;
			if (i >= j) break; //checks if pointers are crossed or not
			exchange(a, i, j); // swap
		}
		exchange(a, low, j); // swaps with partioned items
		System.out.println(Arrays.toString(a));
		return j;// returns index of item now know to be  in place
	}
	/**
	 * Sort method this is a recursive function calls the overloaded sort method.
	 *
	 * @param      a       { parameter_description }
	 * @param      cutoff  The cutoff
	 */
	public static void sort(Comparable[] a, int cutoff) {
		//StdRandom.shuffle(a);
		sort(a, 0, a.length - 1, cutoff);
	}
	/**
	 * it is overloaded sort method it takes parameters as COmparable array, low, high , cutoff values
	 * this method also call Insertion sort method and it is a recursive method
	 * Time complexity N because it is a recursive function.
	 * @param      a       { comparable array }
	 * @param      low     The low of int type
	 * @param      high    The high of int type
	 * @param      cutoff  The cutoff of int type
	 */
	private static void sort(Comparable[] a, int low, int high, int cutoff) {

		if (high <= low + cutoff - 1) {
			Insertion.insertionSort(a, low, high);
			System.out.println("insertionSort called");
			return ;
		}
		int j = partion(a, low, high);
		sort(a, low, j - 1, cutoff);
		sort(a, j + 1, high, cutoff);
	}
	/**
	 * { less function compares two objects of comparable type }
	 *Complexity is 1 because of only one statement is executed at one time
	 * @param      i     { Comparable object}
	 * @param      j     {Comparable object }
	 *
	 * @return     { returns true if the condition is satisfied else it returns false }
	 */
	private static boolean less(Comparable i, Comparable j) {
		return i.compareTo(j) < 0;
	}
	/**
	 * exchange method swaps the two elements
	 * time complexity is 1 because only once the statements are executed
	 * @param      a     { comparable array}
	 * @param      i     { index of comparable array}
	 * @param      j     { index of comparable array }
	 */
	private static void exchange(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
