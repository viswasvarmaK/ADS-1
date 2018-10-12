/**.
 * Class for linkedlist.
 */
class Linkedlist {
	/**.
	 * Class for node.
	 */
	class Node {
		Node next;
		int data;
		/**.
		 * Constructs the object for Node class.
		 *
		 * @param      data  integer type.
		 */
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	int size = 0;
	Node start = null;
	/**
	 * { inserts the element at a given index}
	 * time complexity of this method is 1 because the function is called only at once.
	 * @param      index  The index
	 * @param      val    The value
	 */
	public void insertAt(int index, int val)throws Exception {
		if (index < 0) {
			throw new Exception();
		}
		start = insertAt(index, start, new Node(val), 0);
	}
	/**.
	 * { This method is overloaded by passing 4 parameters and here the element gets inserted at the given index }
	 * The time complexity of this method is N because it is recursive and called N times.
	 * @param      index     The index
	 * @param      first     The first
	 * @param      elemnent  The elemnent
	 * @param      count     The count
	 *
	 * @return     { the return of NOde type}
	 */
	public Node insertAt(int index, Node first, Node elemnent, int count) {
		if(index < 0) {
			System.out.println("Can't insert at this position.");
			return first;
		}
		if (count == index) {
			elemnent.next = first;
			return elemnent;
		}
		first.next = insertAt(index, first.next, elemnent, count + 1);
		size++;
		return first;

	}
	/**.
	 * { this method reverses the given linkedlist }
	 * The time complexity is constant because the method is called only once
	 * @throws     Exception  { if there are no elements in the list it throws an exception }
	 */
	public void reverse() throws Exception {
		if (size == 0) {
			throw new Exception();
		}
		// else if (size == 0) {
		// 	System.out.println("No elements to reverse.");
		// 	return ;
		// }
		reverse(null, start);
	}
	/**.
	 * { this is overloaded method of the above reverse method by passing two parameters }
	 * time complexity is N because it is an recursive method that can be called N times
	 * @param      previous  The previous
	 * @param      current   The current
	 */
	public void reverse(Node previous, Node current) {
		if (current != null ) {
			reverse(current, current.next);
			current.next = previous;
		} else {
			start = previous;
		}
	}
	/**.
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String str = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp.next != null) {
			str = str + temp.data + ", ";
			temp = temp.next;
		} str = str + temp.data + "";
		return str;
	}
}