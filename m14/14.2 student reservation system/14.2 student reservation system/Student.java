/**
 * Class for student.
 */
class Student implements Comparable<Student> {
    String studentname;
    String dob;
    int total, subject1, subject2, subject3;
    String reservation;
    /**
     * Constructs the object for student class.
     *
     * @param      studentname  The studentname
     * @param      dob          The dob
     * @param      subject1     The subject 1
     * @param      subject2     The subject 2
     * @param      subject3     The subject 3
     * @param      total        The total
     * @param      reservation  The reservation
     */
    Student(String studentname, String dob, int subject1, int subject2, int subject3, int total, String reservation) {
        this.studentname = studentname;
        this.dob = dob;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.total = total;
        this.reservation = reservation;
    }
    /**.
     * {gets student name}
     *
     * @return     { return of String type }
     */
    public String getstudentname() {
        return this.studentname;
    }
    /**
     * { gets the date of birth of student}
     *
     * @return     { return of String type }
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * { gets the total score}
     *
     * @return     { return is of int type }
     */
    public int gettotal() {
        return this.total;
    }
    /**
     * { gets the total marks in subject 1 }
     *
     * @return     { return is of int type }
     */
    public int getsubject1() {
        return this.subject1;
    }
    /**.
     * { gets the total marks of subject 2 }
     *
     * @return     { return is of int type }
     */
    public int getsubject2() {
        return  this.subject2;
    }
    /**
     * { gets the total marks of subject 3}
     *
     * @return     { return is of int type }
     */
    public int getsubject3() {
        return this.subject3;
    }
    /**
     * { gets the reservation of studnet }
     *
     * @return     { return is of String type}
     */
    public String getreservation() {
        return this.reservation;
    }
    /**
     * sets student name
     *
     * @param      studentname  The studentname
     */
    public void setstudentname(String studentname) {
        this.studentname = studentname;
    }
    /**
     * sets dob of student
     *
     * @param      dob   The dob
     */
    public void setdob(String dob) {
        this.dob = dob;
    }
    /**
     * sets total marks of student
     *
     * @param      total  The total
     */
    public void settotal(int total) {
        this.total = total;
    }
    /**
     * sets the markss of subject1
     *
     * @param      subject1  The subject 1
     */
    public void setsubject1(int subject1) {
        this.subject1 = subject1;
    }
    /**
     * set total marks of subject 2
     *
     * @param      subject2  The subject 2
     */
    public void setsubject2(int subject2) {
        this.subject2 = subject2;
    }
    /**
     * sets total marks of subject3
     *
     * @param      subject3  The subject 3
     */
    public void setsubject3(int subject3) {
        this.subject3 = subject3;
    }
    /**
     * sets the resevation of student
     *
     * @param      reservation  The reservation
     */
    public void setreservation(String reservation) {
        this.reservation = reservation;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        str = str + this.studentname + "," + this.total + "," + this.reservation;
        //System.out.println();
        return str;

    }
    /**
     * { compares two objects}
     *
     * @param      that  The that
     *
     * @return     { returns true or flase depending on the condition }
     */
    public int compareTo(Student that) {
        if (this.total > that.total)            return -1;
        if (this.total < that.total)            return  1;
        if (this.subject3 > that.subject3)      return -1;
        if (this.subject3 < that.subject3)      return 1;
        if (this.subject2 > that.subject2)      return -1;
        if (this.subject2 < that.subject2)      return  1;
        if (this.subject1 > that.subject1)      return -1;
        if (this.dob.equals(that.dob))          return -1;
        if (this.dob.equals(that.dob))          return 1;
        // if (this.reservation.equals(that.reservation)) return -1;
        // if (this.reservation.equals(that.reservation)) return  1;
        return 0;
    }
    
}