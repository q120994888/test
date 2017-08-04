package cn.bdqn.service.impl;

import cn.bdqn.bean.News_User;
import cn.bdqn.dao.UserDao;
import cn.bdqn.dao.impl.UserDaoimpl;
import cn.bdqn.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao user = new UserDaoimpl();

	public News_User login(String name, String password) {
		return user.login(name, password);
	}

}
