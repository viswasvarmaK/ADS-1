
public class SequentialSearchST<Key, Value> {
    /**.
     *number of key-value pairs
     */
    private int n; 
    /**.
     * // the linked list of key-value pairs
     */
    private Node first;      
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * key of Key type
         */
        private Key key;
        /**
         * val of Value type
         */
        private Value val;
        /**.
         * next of Node type
         */
        private Node next;
        /**.
         * Constructs the object.
         *
         * @param      key   The key
         * @param      val   The value
         * @param      next  The next
         */
        public Node(Key key, Value val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public SequentialSearchST() {
    }
    /**
     * returns the number of key value pairs
     * Time complexity is constant as each statement is executed only once
     * @return     { return of int type}
     */
    public int size() {
        return n;}
    /**
     * Determines if empty.
     * TIme complexity is constant as each statement is executed only once
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * checks if the given key contains or not
     * TIme complexity is constant as each statement is executed only once
     * @param      key   The key
     *
     * @return     { True if contains else false }
     */
    public boolean contains(Key key) {
        return get(key) != null;
    }

    /**
     * Returns the value associated with the given key
     * Time complexity is N as the loop iterates till it finds null
     * @param      key   The key
     *
     * @return     { returns the value if key is present else rteruns null}
     */
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }
    /**
     *  Inserts the key-value pair into the symbol table, overwriting the old value
     * with the new value if the key is already in the symbol table.
     * If the value is {@code null}, this effectively deletes the key from the symbol table.
     * Time complexity is N as loop iterates till end
     * @param      key   The key
     * @param      val   The value
     */
    public void put(Key key, Value val) {
        if (val == null) {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
        n++;
    }

    /**
     * Removes the key and associated value from the symbol table
     * (if the key is in the symbol table).
     * TIme complexity is N as it is call overloaded delete funciton.
     * @param key the key
     */
    public void delete(Key key) {
        first = delete(first, key);
    }
    /**
     * delets the given key
     * Time complexity is N as it is a recurisive function
     * @param      x     { Node }
     * @param      key   The key
     *
     * @return     { return is of Node type }
     */
    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }


    /**
     * Returns all keys in the symbol table as an {@code Iterable}.
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     * @return all keys in the symbol table as an {@code Iterable}
     */
    public Iterable<Key> keys()  {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next)
            queue.enqueue(x.key);
        return queue;
    }


    
   
}
