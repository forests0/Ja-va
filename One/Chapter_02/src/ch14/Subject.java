package ch14;

public class Subject {
	private String subname;
	private int subscore;
	
	public Subject(String subname, int subscore) {
		this.subname = subname;
		this.subscore = subscore;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getSubscore() {
		return subscore;
	}

	public void setSubscore(int subscore) {
		this.subscore = subscore;
	}
	
}
