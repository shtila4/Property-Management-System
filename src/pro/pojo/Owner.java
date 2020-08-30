package pro.pojo;

public class Owner {

	private String yid;
	private String yname;
	private String ysex;
	private String ytel;
	private String ytim;
	private String fid;
	private String lid;
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
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public Owner(String yid, String yname, String ysex, String ytel, String ytim, String fid, String lid) {
		super();
		this.yid = yid;
		this.yname = yname;
		this.ysex = ysex;
		this.ytel = ytel;
		this.ytim = ytim;
		this.fid = fid;
		this.lid = lid;
	}
	public Owner() {
		super();
	}
	

}
