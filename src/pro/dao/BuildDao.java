package pro.dao;

import java.util.List;

import pro.pojo.Build;

public interface BuildDao {

	public List<Build> GetallBuilds();//�õ����е�¥����Ϣ
	public Build GetaABuilds(String lid);//�õ�һ��¥����Ϣ
	public int XiugaiABuild(String lid,String lname,String lnum,String ldata,String id);//�޸�¥����Ϣ
}
