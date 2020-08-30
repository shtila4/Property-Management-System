package pro.pojo;

public class Defend {

	 public Defend() {
		super();
	}
	public Defend(String gid, String lid) {
		super();
		this.gid = gid;
		this.lid = lid;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	private String gid;
	 private String lid;

}
