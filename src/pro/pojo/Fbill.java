package pro.pojo;

public class Fbill {

	private String jid;
	private String yid;
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
	public Fbill(String jid, String yid, String type, String date, String mon) {
		super();
		this.jid = jid;
		this.yid = yid;
		this.type = type;
		this.date = date;
		this.mon = mon;
	}
	public Fbill() {
		super();
	}
	
}
