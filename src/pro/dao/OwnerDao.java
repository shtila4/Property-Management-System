package pro.dao;

import java.util.List;

import pro.pojo.Owner;
import pro.pojo.Yzxinxi;

public interface OwnerDao {
	public Owner getoneOwner(String yid);//查询一个业主的信息
    public List<Yzxinxi>GetALLowners();//获得所有用户的信息利用存储过程
    public int AddaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid);//增加一个业主
    public int DeleteaOwner(String yid);//删除一个业主
    public int UpdateaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid,String id);//修改业主

}
