package cn.bdqn.dao.impl;

import java.sql.SQLException;

import cn.bdqn.bean.News_User;
import cn.bdqn.dao.UserDao;
import cn.bdqn.util.BaseDao;

public class UserDaoimpl extends BaseDao implements UserDao {

	public News_User login(String name, String password) {
		String sql = "select * from news_user where userName=? and password=?";
		Object[] params = { name, password };
		rs = executeQuery(sql, params);
		News_User user = new News_User();
		try {
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("userName"));
				user.setUserType(rs.getInt("userType"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return null;
	}

}
