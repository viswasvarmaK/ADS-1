class Students implements Comparable <Students>{
	String studentname;
	int dateofbirth;
	int subject1marks;
	int subject2marks;
	int subject3marks; 
	int totalmarks;
	String reservationcategory;
	int day;
	int month;
	int year;
	Students(String studentname, int dateofbirth,
	 int subject1marks, int subject2marks, int subject3marks,
	  int totalmarks, String reservationcategory) {
		this.studentname = studentname;
		// String[] dob = dateofbirth.split("-");
		// day = dob[0];
		// dob[1] = month;
		// dob[2] = year;
		this.day = day;
		this.month = month;
		this.year = year;
		this.subject1marks = subject1marks;
		this.subject2marks = subject2marks;
		this.subject3marks = subject3marks;
		this.totalmarks = totalmarks;
		this.reservationcategory = reservationcategory;
	}
	public int compareTo(Students that) {
		if (this.totalmarks > that.totalmarks) return -1;
		if (this.totalmarks < that.totalmarks)  return 1;
		if (this.subject3marks > that.subject3marks) return -1;
		if (this.subject3marks < that.subject3marks)  return 1;
		if (this.subject2marks > that.subject2marks) return -1;
		if (this.subject2marks < that.subject2marks)  return 1;
		if (this.totalmarks > that.totalmarks) return -1;
		if (this.totalmarks < that.totalmarks)  return 1;
		if (this.year > that.year) return -1;
		if (this.year < that.year)  return 1;
		if (this.month > that.month) return -1;
		if (this.month < that.month)  return 1;
		if (this.day > that.day) return -1;
		if (this.day < that.day)  return 1;

		return 0;

	}

}