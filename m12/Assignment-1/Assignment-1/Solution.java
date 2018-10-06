import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    Solution() {

    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String userinput = "";
        while (scan.hasNextLine()) {
            userinput += scan.nextLine();
        int lines = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int notresv = Integer.parseInt(scan.nextLine());
        int bc = Integer.parseInt(scan.nextLine());
        int sc = Integer.parseInt(scan.nextLine());
        int st = Integer.parseInt(scan.nextLine());
        }
    //  while(scan.hasNext()) {
    //      String[] studentTokens = scan.nextLine().split(",");
    //      Students s = new Students(studentTokens[0],
    //      Integer.parseInt(studentTokens[1]),
    //       Integer.parseInt(studentTokens[2]),
    //        Integer.parseInt(studentTokens[3]),
    //         Integer.parseInt(studentTokens[4]),
    //          Integer.parseInt(studentTokens[5]),
    //           studentTokens[6]);
    //  }
    //  Sorting sort = new Sorting();
    //  sort.sort(studentname);
    //  String display = Arrays.toString(studentname);
    //  System.out.println(display);
    //  String userinput = "";
        // String[] inputLines = userinput.split("::");
        while (scan.hasNextLine()) {
            userinput += scan.nextLine() + "::";
        }
        String[] inputLines = userinput.split("::");
        Students[] studentArr = new Students[inputLines.length];
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