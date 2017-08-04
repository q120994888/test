package cn.bdqn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {

	protected Connection connection = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;

	public boolean getConnection() {
		try {
			// 001.加载驱动
			Class.forName(ConfigManager.getValue("jdbc.driverClass"));
			// 002.连接数据库
			connection = DriverManager.getConnection(
					ConfigManager.getValue("jdbc.url"),
					ConfigManager.getValue("jdbc.userName"),
					ConfigManager.getValue("jdbc.password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 释放资源   
	 * 做非空判断
	 */
	public void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int executeUpdate(String sql, Object... params) {
		int rowNum = 0;
		if (getConnection()) {

			try {
				ps = connection.prepareStatement(sql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {

						ps.setObject(i + 1, params[i]);
					}
				}
				rowNum = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		}

		return rowNum;
	}

	public ResultSet executeQuery(String sql, Object... params) {
		if (getConnection()) {
			try {
				ps = connection.prepareStatement(sql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				rs = ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

}
