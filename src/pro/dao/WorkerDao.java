package pro.dao;

import java.util.List;

import pro.pojo.Worker;

public interface WorkerDao {
	

		public Worker getoneWorker(String gid);//��ѯһ��Ա������Ϣ
		public List<Worker>GetallWorkers();//��ѯ����Ա����Ϣ
	    public  int Addaworker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno);//����Ա��
		public int DeleteaWorker(String gid);//ɾ��һ��Ա��
	   public int UpdateaWorker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno,String id);//�޸�Ա��
}
