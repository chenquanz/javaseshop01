package cn.cq.shopsystem01;

import java.util.Scanner;
/**
 * �û��˵���
 * @author CQ
 *
 */
public class UserMenu {
	
	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.��½��2.ע�᣻3.�˳�");
			String choose = scanner.nextLine();
			switch(choose) {
			case "1":
				System.out.println("�������˺ţ�");
				String username = scanner.nextLine();
				System.out.println("���������룺");
				String pwd1 = scanner.nextLine();
				//����ҵ������ĵ�½����
				boolean login = userService.login(username, pwd1);
				if(login) {
					System.out.println("��½�ɹ���");
				}else {
					System.out.println("����û��������벻��ȷ��");
				}
				break;
			case "2":
				System.out.println("�������û�����");
				String name = scanner.nextLine();
				System.out.println("���������룺");
				String pwd2 = scanner.nextLine();
				System.out.println("���ٴ��������룺");
				String pwd3 = scanner.nextLine();
				//����ҵ�������ע�᷽��
				String result = userService.regist(name, pwd2, pwd3);
				switch(result) {
				case "0":
					System.out.println("ע��ɹ���");
					break;
				case "1":
					System.out.println("�û����Ѵ��ڣ�ע��ʧ��");
					break;
				case "2":
					System.out.println("��������벻һ�£�ע��ʧ�ܣ�");
					break;
				default:
					break;
				}
			case "3":
				flag = false;
				break;
			default:
				break;
			}
		}
	}
}
