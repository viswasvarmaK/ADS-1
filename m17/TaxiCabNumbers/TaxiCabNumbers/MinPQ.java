/**.
 * imports comparator package
 */
import java.util.Comparator;
/**.
 * imports Iterator package
 */
import java.util.Iterator;
/**.
 * imports Nosuchelement exception package
 */
import java.util.NoSuchElementException;
/**.
 * Class for minimum pq.
 *
 * @param      <Key>  The key
 */
public class MinPQ<Key> implements Iterable<Key> {
    /**.
     *  store items at indices 1 to n
     */
    private Key[] pq;
    /**
     * // number of items on priority queue
     */
    private int n;      
    /**
     * // optional comparator
     */
    private Comparator<Key> comparator;  

    /**
     * Initializes an empty priority queue with the given initial capacity.
     *
     * @param  initCapacity the initial capacity of this priority queue
     */
    public MinPQ(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initializes an empty priority queue.
     */
    public MinPQ() {
        this(1);
    }
    /**
     * Constructs the object for MinPQ
     *
     * @param      initCapacity  The initialize capacity
     * @param      comparator    The comparator
     */
    public MinPQ(int initCapacity, Comparator<Key> comparator) {
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }
    /**
     * Overides the Constructor the object
     *
     * @param      comparator  The comparator
     */
    public MinPQ(Comparator<Key> comparator) {
        this(1, comparator);
    }

    /**
     * Initializes a priority queue from the array of keys.
     * <p>
     * Takes time proportional to the number of keys, using sink-based heap construction.
     * 
     * @param  keys the array of keys
     */
    public MinPQ(Key[] keys) {
        n = keys.length;
        pq = (Key[]) new Object[keys.length + 1];
        for (int i = 0; i < n; i++)
            pq[i+1] = keys[i];
        for (int k = n/2; k >= 1; k--)
            sink(k);
        assert isMinHeap();
    }
    /**
     * Determines if empty.
     * Time complexity is constant as each statement is executed only once
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of keys on this priority queue.
     * Time complexity is constant as each statement is executed only once
     * @return the number of keys on this priority queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns a smallest key on this priority queue.
     * Time complexity is constant as each statement is executed only once
     * @return a smallest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }
    /**
     * // helper function to double the size of the heap array
     * TIme complexity is N as the for loop iterates for N times
     * @param      capacity  int type
     */
    private void resize(int capacity) {
        assert capacity > n;
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

    /**
     * Adds a new key to this priority queue.
     * Time complexity is logN as it utilises swim funciton.
     * @param  x the key to add to this priority queue
     */
    public void insert(Key x) {
        // double size of array if necessary
        if (n == pq.length - 1) resize(2 * pq.length);

        // add x, and percolate it up to maintain heap invariant
        pq[++n] = x;
        swim(n);
        assert isMinHeap();
    }

    /**
     * Removes and returns a smallest key on this priority queue.
     * Time complexity is logN as it utilises sink funciton.
     * @return a smallest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     */
    public Key delMin() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Key min = pq[1];
        exch(1, n--);
        sink(1);
        pq[n+1] = null;     // to avoid loiterig and help with garbage collection
        if ((n > 0) && (n == (pq.length - 1) / 4)) resize(pq.length / 2);
        assert isMinHeap();
        return min;
    }


   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/
    /**
     * This functoin navigates from bottom to top of the heap
     * Time complexity is logN as it travels from k/2 element
     * @param      k     { parameter_description }
     */
    private void swim(int k) {
        while (k > 1 && greater(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }
    /**
     * This function navigates from top to bottom of the heap
     * Time complexity is logN
     * @param      k     { element of int type }
     */
    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && greater(j, j+1)) j++;
            if (!greater(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

   /***************************************************************************
    * Helper functions for compares and swaps.
    ***************************************************************************/
   /**
    * this function checks if the i element is greater than j or not
    *
    * @param      i     {element of int type}
    * @param      j     { element of int type }
    *
    * @return     { returns true if the condition is staisfied else return false }
    */
    private boolean greater(int i, int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
        }
        else {
            return comparator.compare(pq[i], pq[j]) > 0;
        }
    }
    /**
     * exchanges two elements in the heap
     * TIme complexity is constant as each statement is executed only once.
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    /**
     * Determines if minimum heap.
     * Time complexity is constanst as each statement is executed only once
     * @return     True if minimum heap, False otherwise.
     */
    private boolean isMinHeap() {
        return isMinHeap(1);
    }

    /**
     * Determines if minimum heap.
     * is subtree of pq[1..n] rooted at k a min heap?
     * @param      k     { parameter is of integer type}
     * Time complexity is N as it is a recursive function
     * @return     True if minimum heap, False otherwise.
     */
    private boolean isMinHeap(int k) {
        if (k > n) return true;
        int left = 2*k;
        int right = 2*k + 1;
        if (left  <= n && greater(k, left))  return false;
        if (right <= n && greater(k, right)) return false;
        return isMinHeap(left) && isMinHeap(right);
    }


    /**
     * Returns an iterator that iterates over the keys on this priority queue
     * in ascending order.
     * <p>
     * The iterator doesn't implement {@code remove()} since it's optional.
     *
     * @return an iterator that iterates over the keys in ascending order
     */
    public Iterator<Key> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Key> {
        // create a new pq
        private MinPQ<Key> copy;

        // add all items to copy of heap
        // takes linear time since already in heap order so no keys move
        public HeapIterator() {
            if (comparator == null) copy = new MinPQ<Key>(size());
            else                    copy = new MinPQ<Key>(size(), comparator);
            for (int i = 1; i <= n; i++)
                copy.insert(pq[i]);
        }

        public boolean hasNext()  { return !copy.isEmpty();                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Key next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.delMin();
        }
    }
}
