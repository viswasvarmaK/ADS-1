/**
 * Class for team.
 */
class Team implements Comparable <Team> {
	String teamname;
	int wins;
	int losses;
	int draws;
	/**
	 * Constructs the object.
	 *
	 * @param      teamname  The teamname
	 * @param      wins      The wins
	 * @param      losses    The losses
	 * @param      draws     The draws
	 */
	Team(String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	/**
	 * { gets team name }
	 *
	 * @return     { string }
	 */
	public String getteamname(){
		return this.teamname;
	}
	/**
	 * { gets wins }
	 *
	 * @return     { int }
	 */
	public int getwins(){
		return this.wins;
	}
	/**
	 * {gets losses }
	 *
	 * @return     { int  }
	 */
	public int getlosses(){
		return this.losses;
	}
	/**
	 * { gets draws }
	 *
	 * @return     { int }
	 */
	public int getdraws(){
		return this.draws;
	}
	/**
	 * { Sets team name }
	 *
	 * @param      teamname  The teamname
	 */
	public void setteamname(String teamname){
		this.teamname = teamname;
	}
	/**
	 * { set wins }
	 *
	 * @param      wins  The wins
	 */
	public void setwins(int wins){
		this.wins = wins;
	}
	/**
	 * { set losses }
	 *
	 * @param      losses  The losses
	 */
	public void setlosses(int losses){
		this.losses = losses;
	}
	/**
	 * { set draws }
	 *
	 * @param      draws  The draws
	 */
	public void setdraws(int draws){
		this.draws = draws;
	}
	/**
	 * { compares two objects }
	 *
	 * @param      that  The that
	 *
	 * @return     { -1 if condition satisfies else returns 0 }
	 */
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