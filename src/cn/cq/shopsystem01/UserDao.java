package cn.cq.shopsystem01;
/**
 * ���ݷ��ʽӿ�
 * @author CQ
 *
 */
public interface UserDao {
	/**
	 * ���ز��ҵĶ���
	 * @param Name
	 * @return
	 */
	public User findUserByName(String name); 
	/**
	 * ��黧���Ƿ����
	 * @param name
	 * @return
	 */
	public boolean checkUserIfExist(String name);
	/**
	 * ����û�
	 * @param user
	 */
	public void addUser(User user);
	
}
