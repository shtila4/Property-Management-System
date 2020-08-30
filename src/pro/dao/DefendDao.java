package pro.dao;

import java.util.List;


import pro.pojo.Gview;

public interface DefendDao {
   public List<Gview> getoneDefend(String gid);//查询一个员工的负责区域
   
   public int addDefend(String gid,String lid);//添加一个业务区域
}
