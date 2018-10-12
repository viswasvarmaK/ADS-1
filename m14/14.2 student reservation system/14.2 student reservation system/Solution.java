/**
 *@author Viswas
 * main class that reads the user input
 */ 
import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nostudents = scan.nextInt();
		int vacany = scan.nextInt();
		int unreserved = scan.nextInt();
		int bc = scan.nextInt();
		int sc = scan.nextInt();
		int st = scan.nextInt();
		scan.nextLine();
		Student[] students = new Student[nostudents];
		for (int i = 0; i < students.length; i++) {
            String[] tokens = scan.nextLine().split(",");
           students[i++] = new Student(tokens[0], tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),tokens[6]);
		}
		Heap.sort(students);
		for(Student s : students) {
			System.out.println(s.toString());
		}

	}
}