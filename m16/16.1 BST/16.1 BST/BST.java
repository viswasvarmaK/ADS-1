/**.
 * Class for bst.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
public class BST <Key extends Comparable <Key>, Value> {
	/**
	 * Node type 
	 */
	private Node root;
	/**.
	 * Class for node.
	 */
	private class Node {
		/**.
		 * key of Book type
		 */
		private Book key;
		/**
		 * value of string type
		 */
		private String value;
		/**
		 * left of Node type
		 */
		private Node left;
		/**
		 * right of Node type
		 */
		private Node right;
		/**
		 * Constructs the object for Node class
		 *
		 * @param      key    The key
		 * @param      value  The value
		 */
		public  Node(Book key, String value) {
			this.key = key;
			this.value = value;

		}
	}
	/**
	 * puts the value and key into BST
	 *
	 * @param      key    The key
	 * @param      value  The value
	 */
	public void put(Book key, String value) {
		root = put(root, key, value);
	}
	/**
	 * over rides the put function
	 *
	 * @param      x      { Node }
	 * @param      key    The key
	 * @param      value  The value
	 * Time complexity is N as it is a recursive function
	 * @return     { returns the value if the given conditions are not satisfied else return the node }
	 */
	public Node put(Node x, Book key, String value ) {
		if (x == null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = put(x.left, key, value);
		} else if (cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}

		return x;
	}
	/**
	 * get the value of the given 
	 *
	 * @param      key   The key
	 * Time complexity is N as the while iterates till it reaches null
	 * @return     { returns the value of String type }
	 */
	public String get(Book key) {
		Node x = root;
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if(cmp < 0)  x =x.left;
			else if(cmp>0)    x=x.right;
			else return x.value;

		}
		return null;
	}

}
