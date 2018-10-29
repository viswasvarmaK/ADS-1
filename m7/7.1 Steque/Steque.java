/**.
 * Class for steque.
 */
class Steque {
    /**.
     * Node head
     */
    private Node head = null;
    /**.
     * Node tail
     */
    private Node tail = null;
    /**.
     * Class for node.
     */
    class Node {
        /**.
         * next of node type
         */
        private Node next;
        /**.
         * data of String type
         */
        private String data;
        /**.
         * Constructs the object for Node
         *
         * @param      data1  String
         */
        Node(final String data1) {
            this.data = data1;
            this.next = null;
        }
    }
    /**.
     * pushes the given item to the left of Steque
     * TIme complexity is constant as each statement is exuceted only once.
     * @param      item  String type
     */
    public void push(final String item) {
        Node newnode = new Node(item);
        if (head == null)
            tail = newnode;
        newnode.next = head;
        head = newnode;
    }
    /**.
     * pushes the item to the right of steque
     * Time complexity is 1 as the node is directly added at the tail.
     * @param      item  String
     */
    public void enqueue(final String item) {
        if (head == null) {
            Node newnode = new Node(item);
            head = newnode;
            tail = newnode;
        } else {
            Node newnode1 = new Node(item);
            tail.next = newnode1;
            tail = newnode1;
        }
    }
    /**.
     *Time complexity is constant as each statement is executed only once.
     * { pops the top most item in the steque }
     */
    public void pop() {
        // if (head == null) {
        //     System.out.println("Steque is empty.");
        // }
        if (head != null) {
            head = head.next;
        }
        if (tail != null) {
            tail = tail.next;
        }
    }
    /**.
     * Returns a string representation of the object.
     * Time complexity is N as while loop iteraters till end.
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        Node temp = head;
        if (temp == null) {
            return "Steque is empty.";
        }
        while (temp.next != null) {
            str += temp.data + "," + " ";
            temp = temp.next;
        }
        str += temp.data;
        return str;
    }
}
