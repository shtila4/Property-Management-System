package pro.dao;

import java.util.List;


import pro.pojo.Gview;

public interface DefendDao {
   public List<Gview> getoneDefend(String gid);//��ѯһ��Ա���ĸ�������
   
   public int addDefend(String gid,String lid);//���һ��ҵ������
}
