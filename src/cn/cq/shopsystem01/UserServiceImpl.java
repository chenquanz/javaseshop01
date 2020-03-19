package cn.cq.shopsystem01;
/**
 * �û�����ʵ����
 * @author CQ
 *
 */
public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();
	@Override
	public boolean login(String name, String pwd) {
		//����DAO��Ĺ���ȥ��ѯ�û������Ƿ���ȷ
		User user = userDao.findUserByName(name);
		if(user == null) {
			return false;
		}
		if(user.getPassword().equals(pwd)) {
			return true;
		}
		return false;
		
	}

	@Override
	public String regist(String name, String pwd1, String pwd2) {
		if(!pwd1.equals(pwd2)) {
			return "2";
		}
		//����DAO��Ĺ���ȥ��ѯ�û����Ƿ����
		boolean resoult = userDao.checkUserIfExist(name);
		if(resoult) {
			return "1";
		}
		//ͨ����֤������DAO������û�
		User user = new User(name,pwd1);
		userDao.addUser(user);
		return "0";
	}

}
