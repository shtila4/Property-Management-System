package pro.dao;

import java.util.List;

import pro.pojo.Worker;

public interface WorkerDao {
	

		public Worker getoneWorker(String gid);//查询一个员工的信息
		public List<Worker>GetallWorkers();//查询所有员工信息
	    public  int Addaworker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno);//增加员工
		public int DeleteaWorker(String gid);//删除一个员工
	   public int UpdateaWorker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno,String id);//修改员工
}
