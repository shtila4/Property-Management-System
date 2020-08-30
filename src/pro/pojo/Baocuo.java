package pro.pojo;

public class Baocuo {

	private String bid;
	private String id;
	private String wz;
	private String zq;
	private String sf;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWz() {
		return wz;
	}
	public void setWz(String wz) {
		this.wz = wz;
	}
	public String getZq() {
		return zq;
	}
	public void setZq(String zq) {
		this.zq = zq;
	}
	public String getSf() {
		return sf;
	}
	public void setSf(String sf) {
		this.sf = sf;
	}
	public Baocuo(String bid, String id, String wz, String zq, String sf) {
		super();
		this.bid = bid;
		this.id = id;
		this.wz = wz;
		this.zq = zq;
		this.sf = sf;
	}
	public Baocuo() {
		super();
	}
	
	
}
