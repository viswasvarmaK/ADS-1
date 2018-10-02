import	java.util.Arrays;
import	java.util.Scanner;
class Team implements Comparable <Team> {
	String teamname;
	int wins;
	int losses;
	int draws;
	Team(String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	public String getteamname(){
		return this.teamname;
	}
	public int getwins(){
		return this.wins;
	}
	public int getlosses(){
		return this.losses;
	}
	public int getdraws(){
		return this.draws;
	}
	public void setteamname(String teamname){
		this.teamname = teamname;
	}
	public void setwins(int wins){
		this.wins = wins;
	}
	public void setlosses(int losses){
		this.losses = losses;
	}
	public void setdraws(int draws){
		this.draws = draws;
	}
	public int compareTo(Team that) {
		if (this.wins > that.wins) return -1;
		if(this.wins < that.wins)  return 1;
		if (this.losses < that.losses) return -1;
		if(this.losses > that.losses) return 1;
		if(this.draws > that.draws) return -1;
		if(this.draws < that.draws) return 1;
		return 0;
	}
	public String toString(){
		return this.teamname;
	}
}
class Selection	{
	public boolean LessThan(Comparable element1, Comparable element2) {
		return element1.compareTo(element2) < 0;
	}
	public void exchange(Comparable []a, int index1, int index2) {
		Comparable temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	public void sort(Comparable a[]) {
		// Comparable min = a[i];
		int N = a.length;
		for(int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (LessThan(a[j], a[j-1])) {
					exchange(a, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}
	public int min(Comparable []a, int i) {
		Comparable min = a[i];
		int minIndex = i;
		for (i = i+1; i < a.length; i++) {
			if (LessThan(a[i], min)) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}	
class Solution {
	Solution(){

	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
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
		for (int i = 0; i < teamArr.length; i++){
			String[] teamTockens = inputLines[i].split(",");
			teamArr[i] = new Team(teamTockens[p], Integer.parseInt
				(teamTockens[q]), Integer.parseInt(teamTockens[r]),
				 Integer.parseInt(teamTockens[t]));
		}
		// String[] str = sb.toString().split("::");
		Selection s = new Selection();
		s.sort(teamArr);
		String output = Arrays.toString(teamArr);
		String op = output.replace("[", "").replace
		("]", "").replace(" ", "");
		System.out.println(op);
	}
}
