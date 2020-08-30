package pro.pojo;

public class Room {

	private String lid;
	private String fid;
	private String yn;
	private String yare;
	private String yid;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
	}
	public String getYare() {
		return yare;
	}
	public void setYare(String yare) {
		this.yare = yare;
	}
	public String getYid() {
		return yid;
	}
	public void setYid(String yid) {
		this.yid = yid;
	}
	public Room(String lid, String fid, String yn, String yare, String yid) {
		super();
		this.lid = lid;
		this.fid = fid;
		this.yn = yn;
		this.yare = yare;
		this.yid = yid;
	}
	public Room() {
		super();
	}
	
	
}
