import java.util.*;

public class Sorting{
	Sorting() {

	}
	public static void main(String[] args) {
		System.out.println("enter array");
		String s;
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String input1[] = input.split(",");
		int len = input1.length;
		Comparable input2[] =  new Comparable[len];
		for (int j =0; j < input1.length; j ++) {
			// (input1[j]) = Integer.parseInt(input1[j]);
			(input2[j]) = Integer.parseInt(input1[j]);
		}
		Selection selection = new Selection();
		selection.sort(input2);
		for (int i = 0; i < input2.length; i++) {
			// s = input2[i];
			System.out.println(input2[i]);
		}
	}
}