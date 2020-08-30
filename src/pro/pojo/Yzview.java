package pro.pojo;

public class Yzview {

	
	private String jid;
	private String yid;
	private String yname;
	private String type;
	private String date;
	private String mon;
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
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
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
	public Yzview(String jid, String yid, String yname, String type, String date, String mon) {
		super();
		this.jid = jid;
		this.yid = yid;
		this.yname = yname;
		this.type = type;
		this.date = date;
		this.mon = mon;
	}
	public Yzview() {
		super();
	}
	

}
