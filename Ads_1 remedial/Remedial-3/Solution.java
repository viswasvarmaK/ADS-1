import java.util.*;

public class Solution {

	public Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	int input = Integer.parseInt(scan.nextLine());
    	Student[] stud = new Student[10];
    	int studsize;
    	Foutput foutput = new Foutput();
    	Student  student1 = new Student();
    	for (int i = 0; i < input; i++) {
          String[] tokens = scan.nextLine().split(",");
          Student student = new Student(Integer.parseInt(tokens[0]),tokens[1], Double.parseDouble(tokens[2]));
          stud[i] = student;
          foutput.add(student);
          // studsize++;
        }
        foutput.sort();
		String quires1 = scan.nextLine();
		int quires = Integer.parseInt(quires1);
		for (int i = 0; i < quires; i++) {
			String marks1 = scan.nextLine();
			double marks = Double.parseDouble(marks1);
			for (int j = 0; j < stud.length; j++) {
				if (marks == stud[i].getmarks()) {
					System.out.println(stud[j].toString());
				}

			}
		}	
        // int queries = Integer.parseInt(scan.nextLine());

        // for (int j = 0; j < queries; j++) {
        // 	 Double stdmarks = Double.parseDouble(scan.nextLine());
        // 	 System.out.println("hii");
        // 	 st.getStudent(stdmarks);
        // }
       //  String[]token = scan.nextLine().split(" ");
       // 	switch(token[0]){
       //    case " getmovies":
       //      st.getStudent(token[1]);
       // }  
	}
}