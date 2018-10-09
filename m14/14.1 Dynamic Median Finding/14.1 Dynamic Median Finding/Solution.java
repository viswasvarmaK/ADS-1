/**
 * { item_description }
 */
import java.util.Scanner;
/**
 * main class that reads the input file.
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
        int numbers = scan.nextInt();
        MinPQ<Float> minpq = new MinPQ<Float>(numbers);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(numbers);
        float median = 0.0f;
        for (int i = 0; i < numbers; i++) {
            float s = scan.nextFloat();
            if (s > median) {
                minpq.insert(s);
            } else {
                maxpq.insert(s);
            }
        if (maxpq.size() - minpq.size() > 1) {
            float x = maxpq.delMax();
            minpq.insert(x);
        }
        if (minpq.size() - maxpq.size() > 1) {
            float y = minpq.delMin();
            maxpq.insert(y);
        }
        if (minpq.size() == maxpq.size()) {
            median = (minpq.min() + maxpq.max()) / 2;
            System.out.println(median);
        }
        if (maxpq.size() > minpq.size()) {
            median = maxpq.max();
            System.out.println(median);
        }
        if (minpq.size() > maxpq.size()) {
            median = minpq.min();
            System.out.println(median);
        }
    }
}   }

