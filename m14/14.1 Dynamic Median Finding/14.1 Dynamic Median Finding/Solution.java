import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = Integer.parseInt(scan.nextLine());
		MinPQ<Float> minpq = new MinPQ<Float>(numbers);
		MaxPQ<Float> maxpq = new MaxPQ<Float>(numbers);
		Float median = 0.0f;
		for (int i = 0; i < numbers; i++) {
			float s = scan.nextFloat();
			if (i > median) {
				minpq.insert(s);
			} else {
				maxpq.insert(s);
			}
		}
		if (maxpq.size() - minpq.size() > 1) {
			float x = maxpq.delMax();
			minpq.insert(x);
		} else {
			float y = minpq.delMin();
			maxpq.insert(y);
		}
		if (minpq.size() == maxpq.size()) {
			median = (minpq.min() + maxpq.max()) / 2;
		}
		if (maxpq.size() > minpq.size()) {
			median = maxpq.max();
		}
		if (minpq.size() > maxpq.size()) {
			median = minpq.min();
			System.out.println(median);
		}
		// Float[] arr  = new Float[numbers];
		// for (int i = 0; i < numbers; i++) {
		// 	arr[i] = Float.parseFloat(scan.nextLine());
		// 	System.out.println(arr[i]);
	}
}	

