package pro.pojo;

public class Department {

	private String dno;
	private String dname;
	private String dman;
	public Department() {
		super();
	}
	public Department(String dno, String dname, String dman) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dman = dman;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDman() {
		return dman;
	}
	public void setDman(String dman) {
		this.dman = dman;
	}
	
}
