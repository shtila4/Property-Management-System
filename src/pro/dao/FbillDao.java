package pro.dao;

import java.util.List;

import pro.pojo.FandOandB;
import pro.pojo.Fbill;
import pro.pojo.Yzview;


public interface FbillDao {

	public List<Yzview> getoneFbill(String yid);//查询一个业主的全部缴费记录
	public List<Yzview>GetamonFbill(String yid,String stime,String ftime);//得到一个月的缴费记录
	public Fbill getonejiaofeijilu(String jid);//根据缴费单号获得一个缴费记录
	
	
	public int addFbill(String jid,String yid,String type,String date,String mon);//插入一条缴费记录
	

	public List<FandOandB> GetoneFbill(String yid);//管理员查询一个业主的全部缴费记录
}
