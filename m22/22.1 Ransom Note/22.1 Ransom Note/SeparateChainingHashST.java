
public class SeparateChainingHashST<Key, Value> {
    /**
     * intial capacity of symnbol tabe
     */
    private static final int INIT_CAPACITY = 4;
    /**
     * number of key-value pairs
     */
    private int n;
    /**
     * hash table size
     */
    private int m;
    /**
     * / array of linked-list symbol tables
     */
    private SequentialSearchST<Key, Value>[] st;  


    /**
     * Initializes an empty symbol table.
     */
    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
    } 

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * @param m the initial number of chains
     */
    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m];
        for (int i = 0; i < m; i++)
            st[i] = new SequentialSearchST<Key, Value>();
    } 
    /**
     * resises the hash table
     * Time complexity is N as the loop iterates till the size of table
     * @param      chains  The chains
     */
    private void resize(int chains) {
        SeparateChainingHashST<Key, Value> temp = new SeparateChainingHashST<Key, Value>(chains);
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }
        this.m  = temp.m;
        this.n  = temp.n;
        this.st = temp.st;
    }

    /**
     * // hash value between 0 and m-1
     * Time compleixtyn is constant as each statement is executed only once
     * @param      key   The key
     *
     * @return     { is of int type}
     */
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    } 

    /**
     * Returns the number of key-value pairs in this symbol table.
     * Time compleixtyn is constant as each statement is executed only once
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    } 

    /**
     * Returns true if this symbol table is empty.
     * Time compleixtyn is constant as each statement is executed only once
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * { checks if the given key is in hash table or not}
     *Time compleixtyn is constant as each statement is executed only once
     * @param      key   The key
     *
     * @return     { return is of boolen type }
     */
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    } 
   /**
    * Returns the value associated with the specified key in this symbol table
    * TIme complexity is constant as it returns key directly
    * @param      key   The key
    *
    * @return     { description_of_the_return_value }
    */
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        int i = hash(key);
        return st[i].get(key);
    } 

    /**
     * puts the given key value pair in hash table
     * Time complexity is constant 
     * @param      key   The key
     * @param      val   The value
     */
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }

        // double table size if average length of list >= 10
        if (n >= 10*m) resize(2*m);

        int i = hash(key);
        if (!st[i].contains(key)) n++;
        st[i].put(key, val);
    } 
    /**
     * Removes the specified key and its associated value from this symbol table
     * Time complexity is N as it need to search for the key to be delted
     * @param      key   The key
     */
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");

        int i = hash(key);
        if (st[i].contains(key)) n--;
        st[i].delete(key);

        // halve table size if average length of list <= 2
        if (m > INIT_CAPACITY && n <= 2*m) resize(m/2);
    } 

    // return keys in symbol table as an Iterable
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys())
                queue.enqueue(key);
        }
        return queue;
    } 
}

