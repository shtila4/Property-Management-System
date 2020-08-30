package pro.dao;

import java.util.List;

import pro.pojo.Baocuo;

public interface BaocuoDao {
 public List<Baocuo>GetallBaocuos();//得到所有报错信息
 public Baocuo GetaBaocuo(String bid);//得到报错号信息
 public int Deletebaocuo(String bid);//删除报错信息
 public int insertaBaocuo(String bid,String id,String wz,String zq,String sf);//插入报错信息
}
