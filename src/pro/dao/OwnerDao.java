package pro.dao;

import java.util.List;

import pro.pojo.Owner;
import pro.pojo.Yzxinxi;

public interface OwnerDao {
	public Owner getoneOwner(String yid);//��ѯһ��ҵ������Ϣ
    public List<Yzxinxi>GetALLowners();//��������û�����Ϣ���ô洢����
    public int AddaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid);//����һ��ҵ��
    public int DeleteaOwner(String yid);//ɾ��һ��ҵ��
    public int UpdateaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid,String id);//�޸�ҵ��

}
