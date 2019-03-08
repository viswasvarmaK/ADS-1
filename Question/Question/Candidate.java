public class Candidate implements Comparable<Candidate>{

	public int appid;
	public String name;
	public String mdegree;
	public Double percentage;
	Candidate() {

	}

	Candidate(int appid, String name, String mdegree, Double percentage) {
		this.appid = appid;
		this.name = name;
		this.mdegree = mdegree;
		this.percentage = percentage;
	}

	public void setappid(int appid) {
		this.appid = appid;
	}

	public void setname(String name) {
		this.name = name;
	}
	public void setmdegree(String mdegree) {
		this.mdegree = mdegree;
	}
	public void setappid(Double percentage) {
		this.percentage = percentage;
	}

	public int getappid() {
		return this.appid;
	}

	public String getname() {
		return this.name;
	}
	public String getmdegree() {
		return this.mdegree;
	}
	public Double getpercentage() {
		return this.percentage;
	}

	public int compareTo(Candidate that) {
		if (this.percentage > that.percentage) {
			return 1;
		}
		if (this.percentage < that.percentage) {
			return -1;
		}
		if (this.appid < that.appid) {
			return 1;
		}
		if (this.appid > that.appid) {
			return -1;
		} else {
			return 0;
		}
	}	

	public String toString() {
		String str = "";
		str = str + this.appid + "," + this.name + "," + this.mdegree + "," + this.percentage;
		return str;
	}
}