package pro.dao;

import java.util.List;

import pro.pojo.FandOandB;
import pro.pojo.Fbill;
import pro.pojo.Yzview;


public interface FbillDao {

	public List<Yzview> getoneFbill(String yid);//��ѯһ��ҵ����ȫ���ɷѼ�¼
	public List<Yzview>GetamonFbill(String yid,String stime,String ftime);//�õ�һ���µĽɷѼ�¼
	public Fbill getonejiaofeijilu(String jid);//���ݽɷѵ��Ż��һ���ɷѼ�¼
	
	
	public int addFbill(String jid,String yid,String type,String date,String mon);//����һ���ɷѼ�¼
	

	public List<FandOandB> GetoneFbill(String yid);//����Ա��ѯһ��ҵ����ȫ���ɷѼ�¼
}
