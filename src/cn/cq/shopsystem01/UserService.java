package cn.cq.shopsystem01;
/**
 * �û�����ӿ�
 * @author CQ
 *
 */
public interface UserService {
	/**
	 * �û���½����
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name,String pwd);
	
	/**
	 * �û�ע�᷽��
	 * �ɹ�����0
	 * �û����Ѵ��ڷ���1
	 * ���벻һ�·���2
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return
	 */
	public String regist(String name,String pwd1,String pwd2);
	
	
}
