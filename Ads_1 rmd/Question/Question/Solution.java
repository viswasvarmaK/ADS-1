import  java.util.Scanner;
import  java.util.Arrays;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	class Person implements Comparable <person> {
	int registration;
	int identification;
	}
	person(int registration, int identification) {
		this.registration = registration;
		this.identification = identification;
	}
	public int compareTo(Team that) {
		if (this.identification > that.identification) return -1;
		if(this.identification < that.identification)  return 1;
	}
	public boolean LessThan(Comparable element1, Comparable element2) {
		return element1.compareTo(element2) < 0;
	}
	


	public static void main(String[] args) {
		ST<Integer, Integer> obj = new ST<Integer, Integer>();
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(scan.nextLine()) {
			if (scan.nextLine()==JC) {
				if (count = 0) {
					System.out.println("NO Registrations")
				}
				else {
					System.out.println("NO Registrations")
				}
			}
			else {
			String[] input = scan.nextLine();
			String input_string = input.split(",");
			obj = ST(Integer.parseInt(input_string[0]), Integer.parseInt(input_string[1]));
			count++;
			System.out.println(input_string[0]);
		    }

		}


	}
	public String toString() {

	}
}