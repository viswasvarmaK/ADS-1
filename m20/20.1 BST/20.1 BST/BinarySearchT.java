/**.
 * Class for binary search tree.
 *
 * @param      <Key>     Book object with book details
 * @param      <Values>  The values
 */
class BinarySearchT<Key extends Comparable<Key>, Values> {
    /**.
     * starting element in the BST.
     */
    private Node root;
    /**.
     * Class for node.
     */
    class Node {
        /**.
         * Object of Book class with book details.
         */
        private Key key;
        /**.
         * value of the book in Book class
         */
        private Values value;
        /**.
         * Right node of the BST
         */
        private Node right;
        /**.
         * Left node of BST.
         */
        private Node left;
        /**
         * size of the tree at that node.
         */
        private int size;
        /**
         * Constructs the object.
         *
         * @param      key1   The key 1
         * @param      val    The value
         * @param      size1  The size 1
         */
        Node(final Key key1, final Values val, final int size1) {
            this.key = key1;
            this.value = val;
            this.size = size1;
        }

    }
    /**.
     * This method is to add a key and value to BST.
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final Key key, final Values value) {
        if (key == null) {
            return;
        }
        root = put(root, key, value);
    }
    /**.
     * This method is over loaded put mehtod and used  to add element to BST 
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @param      node   The node
     * @param      key    The key
     * @param      value  The value
     *
     * @return     returns node
     */
    public Node put(final Node node, final Key key,
                    final Values value) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);
        } else {
            node.value = value;
        }
        node.size = 1 + size(node.left) + size(node.right);
        return node;
    }
    /**.
     * This method is to return the value of that key
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @param      key   The key
     *
     * @return     returns the value.
     */
    public Values get(final Key key) {
        return get(root, key);
    }
    /**.
     * This method is overloaded get method and   return the value of that key
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @param      node  the node where the book details and
     *                   values.
     * @param      key   The key
     *
     * @return     returns the value of that key.
     */
    private Values get(final Node node, final Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.value;
        }
    }
    /**.
     * this method returns minimum element in the tree
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @return     returns minimum book details in the tree
     */
    public Key min() {
        return min(root).key;
    }
    /**.
     * this method returns minimum element in the tree
     * it checks only left side of tree to find minimum
     * element.
     ** Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @param      node     node it starts the checkong
     *
     * @return     returns minimum book details in the tree
     */
    private Node min(final Node node) {
        if (node.left == null) {
            return node;
        } else {
            return min(node.left);
        }
    }
    /**.
     * this method returns maximum element in the tree
     ** Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     * @return     returns maximum element in the tree
     */
    public Key max() {
        return max(root).key;
    }
    /**.
     * this method is overloaded returns maximum element in the tree
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      node  The node
     *
     * @return     eturns maximum element in the tree
     */
    private Node max(final Node node) {
        if (node.right == null) {
            return node;
        } else {
            return max(node.right);
        }
    }
    /**.
     * this method returns the value which is next least of the given 
     * book data else returns null.
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      key   The key
     *
     * @return     this method returns the value of the given
     *             book data else returns null.
     */
    public Key floor(final Key key) {
        Node node = floor(root, key);
        if (node == null) {
            return null;
        } else {
            return node.key;
        }
    }
    /**
     * this method returns the value which is next least of the given
     * book data else returns null.
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      node     node with bookdetails
     * @param      key   The key
     *
     * @return     this method returns the value of the given
     *             book data else returns null.
     */
    private Node floor(final Node node, final Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node;
        }
        if (cmp <  0) {
            return floor(node.left, key);
        }
        Node t = floor(node.right, key);
        if (t != null) {
            return t;
        } else {
            return node;
        }
    }
    /**.
     * this method returns the value which is next highest of the given
     * book data else returns null.
     * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      key   The key
     *
     * @return     this method returns the value of the given
     *             book data else returns null.
     */
    public Key ceiling(final Key key) {
        Node node = ceiling(root, key);
        if (node == null) {
            return null;
        } else {
            return node.key;
        }
    }
    /**.
     * this method returns the value which is next highest of the given
     * book data else returns null.
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      node  The node
     * @param      key   The key
     *
     * @return     this method returns the value of the given
     *             book data else returns null.
     */
    private Node ceiling(final Node node, final Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node;
        }
        if (cmp < 0) {
            Node t = ceiling(node.left, key);
            if (t != null) {
                return t;
            } else {
                return node;
            }
        }
        return ceiling(node.right, key);
    }
    /**.
     * this method returns the element in that position
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      k     position given as input
     *
     * @return     returns the element in that position
     */
    public Key select(final int k) {
        Node node = select(root, k);
        return node.key;
    }
    /**.
     * size of tree
     * Time complexity is constant as the statement is executed only once
     * @return     returns size of tree
     */
    public int size() {
        return size(root);
    }
    /**
     * returns size of tree
     * Time Complexity is constant it returns the size of that node.
     *
     * @param      node  The node
     *
     * @return     returns size of tree.
     */
    private int size(final Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.size;
        }
    }
    /**.
     * this method returns the element in that position
     * * Time complexity is h where h is height of tree.
     * It is because it need to travel till the depth of tree.
     *
     * @param      node  The node
     * @param      k     position of node
     *
     * @return     returns node of the that position
     */
    private Node select(final Node node, final int k) {
        if (node == null) {
            return null;
        }
        int t = size(node.left);
        if      (t > k) {
            return select(node.left,  k);
        } else if (t < k) {
            return select(node.right, k - t - 1);
        } else {
            return node;
        }
    }
    /**.
     * this method deletes maximum element from the tree.
     * Time complexity is h where h is the height of the tree.
     *
     */
    public void deleteMax() {
        root = deleteMax(root);
    }
    /**.
     * this method deletes maximum element from the tree.
     * Time complexity is h as h  is the height of the tree.
     *
     * @param      node     the node
     *
     * @return     returns the node
     */
    private Node deleteMax(final Node node) {
        if (node.right == null) {
            return node.left;
        }
        node.right = deleteMax(node.right);
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }
    /**.
     * this method deletes minimum element from the tree.
     * Time complexity is O(h)
     * h is the height of the tree.
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
    /**.
     * this method deletes minimum element from the tree.
     * Time complexity is h because it need to search for 
     * the element and travel till the height of tree
     * h is the height of the tree
     *
     * @param      node  The node
     *
     * @return     returns the node
     */
    private Node deleteMin(final Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }
    /**.
     * this method deletes desired element from the tree.
     * Time complexity is h because it need to search for 
     * the element and travel till the height of tree
     * h is the height of the tree 
     *
     * @param      key   The key
     */
    public void delete(final Key key) {
        root = delete(root, key);
    }
    /**.
     * this method deletes desired element from the tree.
     * Time complexity is h because it need to search for 
     * the element and travel till the height of tree
     * h is the height of the tree
     *
     * @param      node  The node
     * @param      key   The key
     *
     * @return     returns the node
     */
    private Node delete(final Node node, final Key key) {
        Node temp = node;
        if (temp == null) {
            return null;
        }

        int cmp = key.compareTo(temp.key);
        if      (cmp < 0) {
            temp.left  = delete(temp.left,  key);
        } else if (cmp > 0) {
            temp.right = delete(temp.right, key);
        } else {
            if (temp.right == null) {
                return temp.left;
            }
            if (temp.left  == null) {
                return temp.right;
            }
            Node tempNode = temp;
            temp = min(tempNode.right);
            temp.right = deleteMin(tempNode.right);
            temp.left = tempNode.left;
        }
        temp.size = size(temp.left) + size(temp.right) + 1;
        return temp;
    }

}
