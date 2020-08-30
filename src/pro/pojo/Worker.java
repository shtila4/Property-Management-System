package pro.pojo;

public class Worker {

	private String gid;
	private String gname;
	private String gsex;
	private String gtel;
	private String gdate;
	private String gads;
	private String gword;
	private String seleary;
	private String dno;
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGsex() {
		return gsex;
	}
	public void setGsex(String gsex) {
		this.gsex = gsex;
	}
	public String getGtel() {
		return gtel;
	}
	public void setGtel(String gtel) {
		this.gtel = gtel;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public String getGads() {
		return gads;
	}
	public void setGads(String gads) {
		this.gads = gads;
	}
	public String getGword() {
		return gword;
	}
	public void setGword(String gword) {
		this.gword = gword;
	}
	public String getSeleary() {
		return seleary;
	}
	public void setSeleary(String seleary) {
		this.seleary = seleary;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public Worker(String gid, String gname, String gsex, String gtel, String gdate, String gads, String gword,
			String seleary, String dno) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gsex = gsex;
		this.gtel = gtel;
		this.gdate = gdate;
		this.gads = gads;
		this.gword = gword;
		this.seleary = seleary;
		this.dno = dno;
	}
	public Worker() {
		super();
	}
	

}
