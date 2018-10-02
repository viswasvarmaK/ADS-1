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