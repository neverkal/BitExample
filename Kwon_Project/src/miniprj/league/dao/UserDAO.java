package miniprj.league.dao;

import java.util.List;

import miniprj.league.vo.UserVO;

public interface UserDAO {
	public int addUsers(UserVO vo);
	public int updateUsers(String id, String password, String name);
	public int deleteUsers(String id);
	public UserVO getUsers(String id);
	public List<UserVO>getUsersList();
}
