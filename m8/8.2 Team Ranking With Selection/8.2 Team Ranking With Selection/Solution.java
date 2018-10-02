import  java.util.Arrays;
import  java.util.Scanner;
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
        // StringBuffer sb = new StringBuffer();
        String input = "";
        // int count = 0;
        while (scan.hasNextLine()) {
            // sb.append(scan.nextLine() + "::");
            input += scan.nextLine() + "::";
            // count++;
        }
        String[] inputLines = input.split("::");
        Team[] teamArr = new Team[inputLines.length];
        final int p = 0;
        final int q = 1;
        final int r = 2;
        final int t = 3;
        for (int i = 0; i < teamArr.length; i++) {
            String[] teamTockens = inputLines[i].split(",");
            teamArr[i] = new Team(teamTockens[p],
             Integer.parseInt(teamTockens[q]),
              Integer.parseInt(teamTockens[r]),
               Integer.parseInt(teamTockens[t]));
        }
        // String[] str = sb.toString().split("::");
        Insertion s = new Insertion();
        s.sort(teamArr);
        String output = Arrays.toString(teamArr);
        String op =
         output.replace("[", "").replace("]", "").replace(" ", "");
        System.out.println(op);
    }
}
