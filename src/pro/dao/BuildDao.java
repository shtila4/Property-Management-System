package pro.dao;

import java.util.List;

import pro.pojo.Build;

public interface BuildDao {

	public List<Build> GetallBuilds();//得到所有的楼宇信息
	public Build GetaABuilds(String lid);//得到一个楼宇信息
	public int XiugaiABuild(String lid,String lname,String lnum,String ldata,String id);//修改楼宇信息
}
