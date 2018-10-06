import java.util.*;
import java.util.Arrays;
// class Students implements Comparable <Students>{
// 	String studentname;
// 	int dateofbirth;
// 	int subject1marks;
// 	int subject2marks;
// 	int subject3marks; 
// 	int totalmarks;
// 	String reservationcategory;
// 	Students(String studentname, int dateofbirth,
// 	 int subject1marks, int subject2marks, int subject3marks,
// 	  int totalmarks, String reservationcategory) {
// 		this.studentname b= studentname;
// 		// String[] dob = dateofbirth.split("-");
// 		// this.day = Integer.parseInt(day);
// 		// this.month = Integer.parseInt(month);
// 		// this.year = Integer.parseInt(year);
// 		this.subject1marks = subject1marks;
// 		this.subject2marks = subject2marks;
// 		this.subject3marks = subject3marks;
// 		this.totalmarks = totalmarks;
// 		this.reservationcategory = reservationcategory;
// 	}
// 	public int CompareTo(Students that) {
// 		if (this.totalmarks > that.totalmarks) return -1;
// 		if (this.totalmarks < that.totalmarks)  return 1;
// 		if (this.subject3marks > that.subject3marks) return -1;
// 		if (this.subject3marks < that.subject3marks)  return 1;
// 		if (this.subject2marks > that.subject2marks) return -1;
// 		if (this.subject2marks < that.subject2marks)  return 1;
// 		if (this.totalmarks > that.totalmarks) return -1;
// 		if (this.totalmarks < that.totalmarks)  return 1;
// 		return 0;

// 	}

// }
// class Sorting {
// 	Sorting(){

// 	}
// 	public boolean LessThan(Comparable element1, Comparable element2) {
// 		return element1.compareTo(element2) < 0;
// 	}
// 	public void exchange(Comparable[] a,int index1, int index2) {
// 		Comparable temp = a[index1];
// 		a[index1] = a[index2];
// 		a[index2] = temp;
// 	}
// 	public void sort(Comparable a[]) {
// 		int N = a.length;
// 		for(int i = 0; i < N; i++) {
// 			int min = i;
// 			for (int j = i + 1; j < N; j++) {
// 				if (LessThan(a[j], a[min])) {
// 					min = j;
// 				}
// 			}
// 			exchange(a, i, min);
// 		}
// 	}
// }
public class Solution {
	Solution() {

	}
	// static ArrayList<Students> students = new ArrayList<>();
	// static ArrayList<Students> vacancies = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userinput = "";
		while (scan.hasNextLine()) {
            userinput += scan.nextLine();
		int lines =	Integer.parseInt(scan.nextLine());
		int vacancies = Integer.parseInt(scan.nextLine());
		int notresv = Integer.parseInt(scan.nextLine());
		int bc = Integer.parseInt(scan.nextLine());
		int sc = Integer.parseInt(scan.nextLine());
		int st = Integer.parseInt(scan.nextLine());
	    }
	// 	while(scan.hasNext()) {
	// 		String[] studentTokens = scan.nextLine().split(",");
	// 		Students s = new Students(studentTokens[0],
	// 		Integer.parseInt(studentTokens[1]),
	// 		 Integer.parseInt(studentTokens[2]),
	// 		  Integer.parseInt(studentTokens[3]),
	// 		   Integer.parseInt(studentTokens[4]),
	// 		    Integer.parseInt(studentTokens[5]),
	// 		     studentTokens[6]); 
	// 	}
	// 	Sorting sort = new Sorting();
	// 	sort.sort(studentname);
	// 	String display = Arrays.toString(studentname);
	// 	System.out.println(display);
	// 	String userinput = "";
        // String[] inputLines = userinput.split("::");
		while (scan.hasNextLine()) {
            userinput += scan.nextLine() + "::";
        }
        String[] inputLines = userinput.split("::"); 
        Students [] studentArr = new Students[inputLines.length];
        for (int i = 0; i < studentArr.length; i++) {
            String[] studentTockens = inputLines[i].split(",");
            studentArr[i] = new Students(studentTockens[0],
             Integer.parseInt(studentTockens[1]),
              Integer.parseInt(studentTockens[2]),
               Integer.parseInt(studentTockens[3]),
                Integer.parseInt(studentTockens[4]),
                 Integer.parseInt(studentTockens[5]),
                   studentTockens[6]);
        String[] dob = studentTockens[1].split("-");
        int day = Integer.parseInt(dob[0]);
        int month = Integer.parseInt(dob[1]);
        int year = Integer.parseInt(dob[2]);  
        }
        Sorting sort = new Sorting();
        sort.sort(studentArr);
        String display = Arrays.toString(studentArr);
        System.out.println(display);

	
	}
}