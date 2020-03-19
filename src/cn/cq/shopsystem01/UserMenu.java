package cn.cq.shopsystem01;

import java.util.Scanner;
/**
 * 用户菜单类
 * @author CQ
 *
 */
public class UserMenu {
	
	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.登陆；2.注册；3.退出");
			String choose = scanner.nextLine();
			switch(choose) {
			case "1":
				System.out.println("请输入账号：");
				String username = scanner.nextLine();
				System.out.println("请输入密码：");
				String pwd1 = scanner.nextLine();
				//调用业务组件的登陆方法
				boolean login = userService.login(username, pwd1);
				if(login) {
					System.out.println("登陆成功！");
				}else {
					System.out.println("你的用户名或密码不正确！");
				}
				break;
			case "2":
				System.out.println("请输入用户名：");
				String name = scanner.nextLine();
				System.out.println("请输入密码：");
				String pwd2 = scanner.nextLine();
				System.out.println("请再次输入密码：");
				String pwd3 = scanner.nextLine();
				//调用业务组件的注册方法
				String result = userService.regist(name, pwd2, pwd3);
				switch(result) {
				case "0":
					System.out.println("注册成功！");
					break;
				case "1":
					System.out.println("用户名已存在，注册失败");
					break;
				case "2":
					System.out.println("输入的密码不一致，注册失败！");
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
