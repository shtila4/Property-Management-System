package pro.pojo;

public class Gview {

  private String gid;
  private String gname;
  private String gword;
  private String lid;
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
public String getGword() {
	return gword;
}
public void setGword(String gword) {
	this.gword = gword;
}
public String getLid() {
	return lid;
}
public void setLid(String lid) {
	this.lid = lid;
}
public Gview(String gid, String gname, String gword, String lid) {
	super();
	this.gid = gid;
	this.gname = gname;
	this.gword = gword;
	this.lid = lid;
}
public Gview() {
	super();
}
  

}
