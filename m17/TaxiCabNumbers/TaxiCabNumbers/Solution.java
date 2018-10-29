/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * This class is used to find the nth taxicab numbers
 * which can be formed with m pairs.
 * 
 */
public final class Solution {

	/**
	 *@author Viswas.
	 * Default Constructor.
	 */
	private Solution() {

	}

	/**
	 * To demonstrate the solution.
	 * @param args command line arguments.
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		System.out.println(Taxicab.findTaxicab(N, M));
	}
}
