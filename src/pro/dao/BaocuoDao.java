package pro.dao;

import java.util.List;

import pro.pojo.Baocuo;

public interface BaocuoDao {
 public List<Baocuo>GetallBaocuos();//�õ����б�����Ϣ
 public Baocuo GetaBaocuo(String bid);//�õ��������Ϣ
 public int Deletebaocuo(String bid);//ɾ��������Ϣ
 public int insertaBaocuo(String bid,String id,String wz,String zq,String sf);//���뱨����Ϣ
}
