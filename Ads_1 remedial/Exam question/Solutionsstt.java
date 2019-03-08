import java.util.*;

public class Solutionsstt {

	Solutionsstt() {

	}
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new Queue<Integer>();
		String input = scan.nextLine();
		boolean flag = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
				if (queue.size() <= 1 || queue.isEmpty()) {
			    		System.out.println("not possible");
			    		flag = false;
			    		break;
			    	}
				// System.out.println("hello");
				x = queue.dequeue();
			    y = queue.dequeue();
			}
			    if (input.charAt(i) == '+') {
			    	// System.out.println("if");
			    	if (queue.size() <= 1 || queue.isEmpty()) {
			    		System.out.println("not possible");
			    		flag = false;
			    		break;
			    	}
			    	z = x + y;
			    	queue.enqueue(z);
			    }
			    else if (input.charAt(i) == '-') {
			    	if (queue.size() <= 1 || queue.isEmpty()) {
			    		System.out.println("not possible");
			    		flag = false;
			    		break;
			    	}
			    	z = x - y;
			    	queue.enqueue(z);
			    }
			    else if (input.charAt(i) == '*') {
			    	if (queue.size() <= 1 || queue.isEmpty()) {
			    		System.out.println("not possible");
			    		flag = false;
			    		break;
			    	}
			    	z = x * y;
			    	queue.enqueue(z);
			    } else { 
			    	char char1 =input.charAt(i);
				queue.enqueue(Integer.parseInt(String.valueOf(char1)));
				// System.out.println("else  block");

			    }   
		} if (flag) {
		System.out.println(queue.peek());	
		}
		
	}

}