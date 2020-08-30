package pro.pojo;

public class FandOandB {

	private String jid;
	private String yid;
	private String yanme;
	private String type;
	private String date;
	private String mon;
	private String ytel;
	private String lname;
	private String fid;
	public String getJid() {
		return jid;
	}
	public void setJid(String jid) {
		this.jid = jid;
	}
	public String getYid() {
		return yid;
	}
	public void setYid(String yid) {
		this.yid = yid;
	}
	public String getYanme() {
		return yanme;
	}
	public void setYanme(String yanme) {
		this.yanme = yanme;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getYtel() {
		return ytel;
	}
	public void setYtel(String ytel) {
		this.ytel = ytel;
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
	public FandOandB(String jid, String yid, String yanme, String type, String date, String mon, String ytel,
			String lname, String fid) {
		super();
		this.jid = jid;
		this.yid = yid;
		this.yanme = yanme;
		this.type = type;
		this.date = date;
		this.mon = mon;
		this.ytel = ytel;
		this.lname = lname;
		this.fid = fid;
	}
	public FandOandB() {
		super();
	}
	
	
}
