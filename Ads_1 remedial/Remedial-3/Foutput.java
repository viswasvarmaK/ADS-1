import java.util.*;
class Foutput {
	Student[] student;
	int size;
	Foutput() {
		student = new Student[20];
		size = 0;
	}
	public void add(Student std) {
		if (student.length == size) {
			resize();
		}
		student[size++ ] = stud;
	}
	public void sort() {
		Insertionsort insertionsort = new Insertionsort();
		insertionsort.sort(student,size);
	}
	public void resize() {
		student = Arrays.copyOf(student,student.length * 2);
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < size ; i++ ) {
			str += student[i].getRollno()+"," + student[i].getName() + "," + student[i].getMarks() + "\n";
		}
		return str;
	}

}