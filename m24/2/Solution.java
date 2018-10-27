import java.util.Scanner;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Solution {
    Solution() {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int datalength = Integer.parseInt(scan.nextLine());
        SeparateChainingHashST <Integer, Student> student = new SeparateChainingHashST<>();
        Student s = null;
        while (datalength > 0) {
            String[] line = scan.nextLine().split(",");
            s = new Student(line[1], line[2]);
            student.put(Integer.parseInt(line[0]), s);
            datalength--;
        }
        int inputcases = Integer.parseInt(scan.nextLine());
        while (inputcases > 0) {
            String[] tokens = scan.nextLine().split(" ");
            if (tokens[2].equals("1")) {
                int key = Integer.parseInt(tokens[1]);
                if(student.contains(key)) {
                    System.out.println(student.get(key).stdname);
                }else {
                    System.out.println("Student doesn't exists...");
                }
                
            } else if (tokens[2].equals("2")) {
                int key = Integer.parseInt(tokens[1]);
                if(student.contains(key)) {
                    System.out.println(student.get(key).stdmarks);
                }else {
                    System.out.println("Student doesn't exists...");
                }
            }

            inputcases--;
        }

    }
}    