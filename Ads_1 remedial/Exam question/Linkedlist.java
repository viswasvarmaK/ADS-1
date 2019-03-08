import java.util.*;

public class Linkedlist{
	public Node first;
	public int size;
	Linkedlist(){
		first = null;
		size = 0;
	}
	public class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void pushRight(int data){
		Node newnode = new Node(data);
		if (first == null) {
			System.out.println("no elements in list");
			first = newnode;
			
			size++;
		} else {
		Node temp = first;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		newnode.next= null;
		size++;
		}
	}

	public void print(){
		Node temp = first;
		while (temp.next != null) {
			System.out.println(temp.data);
		}
	}







	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Linkedlist lt = new Linkedlist();
		while (scan.hasNext()) {
			String[] input = scan.nextLine().split(" ");
			switch(input[0]) {
			case "pushRight":
				lt.pushRight(Integer.parseInt(input[1]));
				// lt.print();
				break;
			case "print":
				lt.print();
				break;		
			}
		}
	}
}