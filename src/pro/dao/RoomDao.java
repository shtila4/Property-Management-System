package pro.dao;

import java.util.List;

import pro.pojo.Room;



public interface RoomDao {
	public List<Room> GetallRooms();//得到所有的房间信息
	public Room GetaARoom(String lid,String fid);//得到一个房间信息
	public int XiugaiARoom(String lid,String fid,String yn,String yare,String yid,String a,String b);//修改房间信息
	public int GetRoomSum();//得到非空房间的数量
	public int UpdateFid(String lid,String oldfid,String newfid);//利用存储过程修改对应业主的房间号
    
}
