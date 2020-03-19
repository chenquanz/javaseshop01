package cn.cq.shopsystem01;
/**
 * 用户管理接口
 * @author CQ
 *
 */
public interface UserService {
	/**
	 * 用户登陆方法
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name,String pwd);
	
	/**
	 * 用户注册方法
	 * 成功返回0
	 * 用户名已存在返回1
	 * 密码不一致返回2
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return
	 */
	public String regist(String name,String pwd1,String pwd2);
	
	
}
