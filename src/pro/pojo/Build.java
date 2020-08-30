package pro.pojo;

public class Build {

	private String lid;
	private String lname;
	private String lnum;
	private String ldata;
	public Build(String lid, String lname, String lnum, String ldata) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lnum = lnum;
		this.ldata = ldata;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLnum() {
		return lnum;
	}
	public void setLnum(String lnum) {
		this.lnum = lnum;
	}
	public String getLdata() {
		return ldata;
	}
	public Build() {
		super();
	}
	public void setLdata(String ldata) {
		this.ldata = ldata;
	}
	
	

}
