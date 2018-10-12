/**
 * imports no such element exception
 */
import java.util.NoSuchElementException;
/**
 * Class for minimum pq.
 *
 * @param      <Key>  The key
 */
public class MinPQ<Key extends Comparable<Key>> {
	/**
	 * Key array
	 */
	private Key[] pq;
	/**
	 * integer type
	 */
	private int n;
	/**
	 * Constructs the object.for MinPQ class
	 *
	 * @param      capacity  The capacity
	 */
	public MinPQ(int capacity) {
		pq = (Key[]) new Object[capacity + 1];
	}
	/**
	 * Constructs the object.
	 *
	 * @param      a     { array of Key type }
	 */
	public MinPQ(Key[] a) {
		this.pq = a;
		this.n = 0;
	}
	/**
	 * Determines if empty.
	 * Time complexity is 1 because only one statement is executed at once
	 * @return     True if empty, False otherwise.
	 */
	public boolean isEmpty() {
		return n == 0;
	}
	/**
	 * gives size of pq array
	 *Time complexity is 1 because only one statement is executed at once
	 * @return     { type of intiger}
	 */
	public int size() {
		return n;
	}
	/**
	 * inserts the item in pq array
	 *Time complexity is logN because of swim funciton
	 * @param      item  The item
	 */
	public void insert(Key item) {
		pq[++n] = item;
		swim(n);
	}
	/**
	 * { Deletes the min element}
	 *Time complexity is logN because of swim funciton
	 * @return     {Key}
	 */
	public Key delMin() {
		if(isEmpty()) throw new NoSuchElementException("Queue is underflow");
		Key min = pq[1];
		exchange(1,n--);
		sink(1);
		return min;
	}
	/**
     * swim function it generally moves the element to upwards.
     * Time complixity is N because of while loop
     * @param      k     { key type}
     */
    private void swim(int k) {
        while (k > 1 && greater(k/2, k)) {
            exchange(k, k/2);
            k = k/2;
        }
    }
    /**
     * sink function itn generally moves the elements to downwards
     * Time complexity is N because of while loop 
     * @param      k     {key type }
     */
    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && greater(j, j+1)) j++;
            if (!greater(k, j)) break;
            exchange(k, j);
            k = j;
        }
    }

   /***************************************************************************
    * Helper functions for compares and swaps.
    ***************************************************************************/
   /**
    * compares two objects and returns true or false
    * time complexity is 1 because all the statements are executed only once
    * @param      i     { index of array element }
    * @param      j     { index of array element}
    *
    * @return     { returns true if condition is satified or false }
    */
    private boolean greater(int i, int j) {
        
            return pq[i].compareTo(pq[j]) > 0;
        
    }
    /**
     * swaps the two elements of the pq
     * Time complexity is 1 because only once the statements are executed
     * @param      i     { index of comparable array}
     * @param      j     { index of comparable array}
     */
    private void exchange(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
}