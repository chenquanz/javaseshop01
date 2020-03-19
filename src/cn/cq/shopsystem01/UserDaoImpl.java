package cn.cq.shopsystem01;
/**
 * 数据访问接口实现类
 * @author CQ
 *
 */

public class UserDaoImpl implements UserDao{
	/**
	 * 根据用户名返回用户实例
	 */
	@Override
	public User findUserByName(String name) {
		User user = UserDatabase.userMap.get(name);
		return user;
	}
	/**
	 * 检查数据库中是否已存在该用户
	 */
	@Override
	public boolean checkUserIfExist(String name) {
		boolean containsKey = UserDatabase.userMap.containsKey(name);
		return containsKey;
	}

	@Override
	public void addUser(User user) {
		UserDatabase.userMap.put(user.getUserName(), user);
	}

}
