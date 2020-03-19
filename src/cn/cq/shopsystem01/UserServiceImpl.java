package cn.cq.shopsystem01;
/**
 * 用户管理实现类
 * @author CQ
 *
 */
public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();
	@Override
	public boolean login(String name, String pwd) {
		//调用DAO层的功能去查询用户密码是否正确
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
		//调用DAO层的功能去查询用户名是否存在
		boolean resoult = userDao.checkUserIfExist(name);
		if(resoult) {
			return "1";
		}
		//通过验证，调用DAO层添加用户
		User user = new User(name,pwd1);
		userDao.addUser(user);
		return "0";
	}

}
