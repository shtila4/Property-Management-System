package pro.dao;

import java.util.List;

import pro.pojo.Room;



public interface RoomDao {
	public List<Room> GetallRooms();//�õ����еķ�����Ϣ
	public Room GetaARoom(String lid,String fid);//�õ�һ��������Ϣ
	public int XiugaiARoom(String lid,String fid,String yn,String yare,String yid,String a,String b);//�޸ķ�����Ϣ
	public int GetRoomSum();//�õ��ǿշ��������
	public int UpdateFid(String lid,String oldfid,String newfid);//���ô洢�����޸Ķ�Ӧҵ���ķ����
    
}
