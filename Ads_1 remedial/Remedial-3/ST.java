import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class ST {
	int rollno;
	String name;
	Double marks;
	ST[] arr;
	int arrsize;

	public ST(){
		arr = new ST[100];
        arrsize = 10;
	}
	public ST(int rollno, String name, Double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void addStudent(ST st) {
		if (arrsize < arr.length){
                resize();
            }
        for (int i = 0;i < arr.length;i++) {
            if (arr[i]==null) {
                arr[i] = st;
                arrsize++;
                break;
            }
            
        }    
	}
	public void getStudent(Double stdmarks){
        for (int i = 0; i < arrsize; i++) {
            if (arr[i].getmarks().equals(stdmarks)) {
                System.out.println(toString());
                
            }
            
        }

    }
	public void resize(){
        if (arrsize < arr.length){
            arrsize = arrsize * 2;
        }
    }
    public void setrollno(int newrollno) {
    	this.rollno = newrollno;
    }
    public int getrollno() {
    	return rollno;
    }
    public void setname(String newname) {
    	this.name = newname;
    }
    public String getname() {
    	return this.name;
    }
    public void setmarks(Double newmarks) {
    	this.marks = newmarks;
    }
    public Double getmarks() {
    	return marks;
    }
    //public String toString() {
	// 	return this.rollno + "," + this.name + "," + this.marks; 
	// }


    public int compareTo(Double marks) {
		return this.marks.compareTo(marks) ;
	}

}