import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public Solution(){

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int len = scan.nextInt();
		int a[] = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println(" Enter the Elements into the array ");
			a[i] = scan.nextInt(); 
		}
		Arrays.sort(a);
		int check = 1;
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] == a[i+1]) {
				check += 1;
			}
			else
			{
				count += check*(check-1)/2;
				check = 1;
			}
		}
		count += check*(check-1)/2;
		System.out.println("count is " + count);
	}
}