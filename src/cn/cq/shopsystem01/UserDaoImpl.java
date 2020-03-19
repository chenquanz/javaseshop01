package cn.cq.shopsystem01;
/**
 * ���ݷ��ʽӿ�ʵ����
 * @author CQ
 *
 */

public class UserDaoImpl implements UserDao{
	/**
	 * �����û��������û�ʵ��
	 */
	@Override
	public User findUserByName(String name) {
		User user = UserDatabase.userMap.get(name);
		return user;
	}
	/**
	 * ������ݿ����Ƿ��Ѵ��ڸ��û�
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
