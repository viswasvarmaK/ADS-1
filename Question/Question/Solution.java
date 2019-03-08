import java.util.*;

public class Solution{
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaxPQ<Candidate> maxpq = new MaxPQ<>(); 
		int input = scan.nextInt();
		while (scan.hasNext()) {
			String input1 = scan.nextLine();
			String[] token = input1.split(" ");
			
			
			switch(token[0]) {
				case "Apply" :
					String[] tokens = token[1].split(",");
					Candidate candidate = new Candidate(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Double.parseDouble(tokens[3]));
					maxpq.insert(candidate);
					break;
				case "Recruit_Top_Candidate" :
					System.out.println(maxpq.delMax());
					break;
				case "Ranking" :
					System.out.println();
					int size = maxpq.size();

					for (int i = 0; i < size; i++) {
						System.out.println(i+1 + ":" + maxpq.delMax());
					}
				}
		}
	}
}