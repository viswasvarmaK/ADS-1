import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String userinput = "";
        final int p = 0;
        final int q = 1;
        final int r = 2;
        final int s = 3;
        final int t = 4;
        final int u = 5;
        final int v = 6;
        while (scan.hasNextLine()) {
            userinput += scan.nextLine();
        int lines = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int notresv = Integer.parseInt(scan.nextLine());
        int bc = Integer.parseInt(scan.nextLine());
        int sc = Integer.parseInt(scan.nextLine());
        System.out.println("hii");
        int st = Integer.parseInt(scan.nextLine());
        System.out.println("hii");

        while (scan.hasNextLine()) {
            userinput += scan.nextLine() + "::";
        }
        }
        String[] inputLines = userinput.split("::");
        Students[] studentArr = new Students[inputLines.length];
        for (int i = 0; i < studentArr.length; i++) {
            String[] studentTockens = inputLines[i].split(",");
            studentArr[i] = new Students(studentTockens[p],
             Integer.parseInt(studentTockens[q]),
              Integer.parseInt(studentTockens[r]),
               Integer.parseInt(studentTockens[s]),
                Integer.parseInt(studentTockens[t]),
                 Integer.parseInt(studentTockens[u]),
                   studentTockens[v]);
            System.out.println("hii");
        String[] dob = studentTockens[1].split("-");
        int day = Integer.parseInt(dob[0]);
        int month = Integer.parseInt(dob[1]);
        int year = Integer.parseInt(dob[2]);
        System.out.println("hii");
        }
        Sorting sort = new Sorting();
        sort.sort(studentArr);
        String display = Arrays.toString(studentArr);
        System.out.println(display);
    }
}
// public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String userinput = "";
//         int n = 6;
//         int i = 0;
//         while (scan.hasNextLine() && i < n) {
//             String[] studentTockens; = inputLines[i].split(",");
//             studentArr[i] = new Students(Integer.parseInt(studentTockens[p]),
//              Integer.parseInt(studentTockens[q]),
//               Integer.parseInt(studentTockens[r]),
//                Integer.parseInt(studentTockens[s]),
//                 Integer.parseInt(studentTockens[t]),
//                  Integer.parseInt(studentTockens[u]));
//         }


//         while (scan.hasNextLine()) {
//             userinput += scan.nextLine() + "::";
//         }
//         String[] inputLines = userinput.split("::");
//         Players[] playersArr = new Players[inputLines.length];
//         for (int i = 0; i < n; i++) {
//             String[] playersTockens = inputLines[i].split(",");
//             playersArr[i] = new Players(playersTockens[0],
//              Integer.parseInt(playersTockens[1]),
//               Integer.parseInt(playersTockens[2]),
//                Integer.parseInt(playersTockens[3]),
//                 Integer.parseInt(playersTockens[4]),
//                  Integer.parseInt(playersTockens[5]),
//                   Integer.parseInt(playersTockens[6]),
//                    Integer.parseInt(playersTockens[7]));
//         }
//         Sorting sort = new Sorting();
//         sort.sort(playersArr);
//         String display = Arrays.toString(playersArr);
//         System.out.println(display);

//     }
