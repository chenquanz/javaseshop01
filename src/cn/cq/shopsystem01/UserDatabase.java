package cn.cq.shopsystem01;

import java.util.HashMap;
/**
 * 模拟用户数据库
 * 使用静态HashMap保证数据只有一份
 * @author CQ
 *
 */


public class UserDatabase {
	public static HashMap<String, User> userMap = new HashMap<String, User>();

}
