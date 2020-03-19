package cn.cq.shopsystem01;
/**
 * 数据访问接口
 * @author CQ
 *
 */
public interface UserDao {
	/**
	 * 返回查找的对象
	 * @param Name
	 * @return
	 */
	public User findUserByName(String name); 
	/**
	 * 检查户名是否存在
	 * @param name
	 * @return
	 */
	public boolean checkUserIfExist(String name);
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	
}
