package pro.pojo;

public class Yzxinxi {

	private String yid;
	private String yname;
	private String ysex;
	private String ytel;
	private String ytim;
	private String lname;
	private String fid;
	public String getYid() {
		return yid;
	}
	public void setYid(String yid) {
		this.yid = yid;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	public String getYsex() {
		return ysex;
	}
	public void setYsex(String ysex) {
		this.ysex = ysex;
	}
	public String getYtel() {
		return ytel;
	}
	public void setYtel(String ytel) {
		this.ytel = ytel;
	}
	public String getYtim() {
		return ytim;
	}
	public void setYtim(String ytim) {
		this.ytim = ytim;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public Yzxinxi(String yid, String yname, String ysex, String ytel, String ytim, String lname, String fid) {
		super();
		this.yid = yid;
		this.yname = yname;
		this.ysex = ysex;
		this.ytel = ytel;
		this.ytim = ytim;
		this.lname = lname;
		this.fid = fid;
	}
	public Yzxinxi() {
		super();
	}
	

}
