import java.util.*;

public class Solutionmaxpq{
	Solutionmaxpq(){

	}
	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input[] = input1.split(",");
		int len = input.length;
		MaxPQ<Integer> maxpq = new MaxPQ();
		MinPQ<Integer> minpq = new MinPQ();
		for (int i = 0; i < len; i++) {
		maxpq.insert(Integer.parseInt(input[i]));
		minpq.insert(Integer.parseInt(input[i]));
		}
		System.out.println("please enter the number of rotations you need");
		int rotate = scan.nextInt();
		if (maxpq.size() < rotate) {
			System.out.println("operation not possible");
		} else {
			for (int j = 0; j < rotate; j++) {
				sum += minpq.delMin() + maxpq.delMax(); 
				// total = total + sum;
				
				
			}
			System.out.println(sum);
		}
	}
}