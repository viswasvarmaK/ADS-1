import java.util.*;

public class Game{
	Game() {

	}
	public static void main(String[] args) {
		int z = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		int winningpoints = 0;
		Scanner scan =  new Scanner(System.in);
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		System.out.println("enter array1 size");
		int n = scan.nextInt();
		System.out.println("enter array2 size");
		int s = scan.nextInt();
		int array1[] = new int[n];
		int array2[] = new int[s];
		for (int i = 0; i < n; i++) {
			System.out.println("enter array1 elements");
			array1[i] = scan.nextInt();
		}
		for (int j = 0; j < s; j++) {
			System.out.println("enter array2 elements");
			array2[j] = scan.nextInt();
		}
		for (int k = n-1 ; k >= 0 ; k--) {
			stack1.push(array1[k]);
		}
		for (int l = s-1 ; l >= 0 ; l--) {
			stack2.push(array2[l]);
		}
		System.out.println("how many elements sum do u want");
		int a = scan.nextInt();
		for (int m = 0; m < a; m++) {
			b = stack1.pop();
			c = stack2.pop();
			z = b + c;
			sum += z;
		}
		System.out.println(sum);
		System.out.println("enter the winning points of the opponent");
		winningpoints = scan.nextInt();
		if (winningpoints < sum){
			System.out.println("YOU WON");
		} else {
			System.out.println("Opponent WON  the match");
		}
	}
}
