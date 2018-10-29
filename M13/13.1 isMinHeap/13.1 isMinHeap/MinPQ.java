/**.
* Class for minimum pq.
*
* @param      <Key>  The key
*/
public class MinPQ <Key extends Comparable <Key>> {
	/**
	 * pq array of key type
	 */
	private Key[] pq;
	/**
	 * size of array
	 */
	private int n;
	/**
	 * Constructs the object for class MinPQ
	 *
	 * @param      array  The array
	 */
	MinPQ(final Key[] array) {
		this.pq = array;
		this.n = array.length - 1;
		//System.out.println("length" +n);
	}
	/**
	 * Checks if the array is min heap or not
	 * TIme complexityis N because it is a recurive function and each method is called N times.
	 * @return     True if minimum pq, False otherwise.
	 */
	public boolean isMinPQ(int k) {
		if (k > n) {
			return true;
		}
		//System.out.println("value of k is " +k);
		int left = 2 * k;
		//System.out.println("left is ..." +left);
		int rigth = 2 * k + 1;
		//System.out.println("rigth is ..."+rigth);
		if (left <= n && !less(k, left)) {
			//System.out.println("value of left is ..." + left);
			return false;
		}
		if (rigth <= n && !less(k, rigth)) {
			//System.out.println("value of rigth is ...." + rigth);
			return false;
		}
		return isMinPQ(left) && isMinPQ(rigth);
	}
	/**
	 * Determines if minimum pq.
	 * TIme complexity is constant as each statement is exucted only once
	 * @return     True if minimum pq, False otherwise.
	 */
	public boolean isMinPQ() {
		//System.out.println("Hello");
		return isMinPQ(1);
	}
	/**
	 * { compares two elements of pq array }
	 *  Time complexity is constant the statement is executed only once
	 * @param      i     { index of pq array }
	 * @param      j     { index of pq array }
	 *
	 * @return     { true if the condition is satisfied else it returns false}
	 */
	public boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}
}
