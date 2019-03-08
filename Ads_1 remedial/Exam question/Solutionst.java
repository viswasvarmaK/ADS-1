import java.util.*;

public class Solutionst{
	public int sum = 0;
	Solutionst(){

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("total elements");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i<n; i++) {
		arr[i] = scan.nextInt();	
		}
		System.out.println(total(arr));

	}
	public static int total(int arr[]) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];

		}
		return sum;
	}
	

}