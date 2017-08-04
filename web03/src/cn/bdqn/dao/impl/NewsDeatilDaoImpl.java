package cn.bdqn.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.dao.NewsDetailDao;
import cn.bdqn.util.BaseDao;

public class NewsDeatilDaoImpl extends BaseDao implements NewsDetailDao {

	/**
	 * 显示所有新闻信息
	 */
	public List<News_Detail> showAllNews() {
		String sql = "select * from news_detail";
		ArrayList<News_Detail> lists = new ArrayList<News_Detail>();
		rs = executeQuery(sql);
		try {
			while (rs.next()) {
				News_Detail nd = new News_Detail();
				nd.setId(rs.getInt("id"));
				nd.setCategoryId(rs.getInt("categoryId"));
				nd.setAuthor(rs.getString("author"));
				nd.setTitle(rs.getString("title"));
				nd.setSummary(rs.getString("summary"));
				nd.setContent(rs.getString("content"));
				nd.setPicPath(rs.getString("picPath"));
				nd.setCreateDate(rs.getDate("createDate"));
				nd.setModifyDate(rs.getDate("modifyDate"));
				lists.add(nd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return lists;
	}

	/**
	 * 根据id删除指定新闻
	 * */

	public int deleteNews(int id) {
		String sql = "delete from news_detail where id=?";
		Object[] params = { id };
		int rows = executeUpdate(sql, params);
		return rows;
	}

	public News_Detail findById(Serializable id) {
		String sql = "select * from news_detail where id=?";
		Object[] params = { id };

		News_Detail nd = null;
		rs = executeQuery(sql, params);
		try {
			while (rs.next()) {
				nd = new News_Detail();
				nd.setId(rs.getInt("id"));
				nd.setCategoryId(rs.getInt("categoryId"));
				nd.setAuthor(rs.getString("author"));
				nd.setTitle(rs.getString("title"));
				nd.setSummary(rs.getString("summary"));
				nd.setContent(rs.getString("content"));
				nd.setPicPath(rs.getString("picPath"));
				nd.setCreateDate(rs.getDate("createDate"));
				nd.setModifyDate(rs.getDate("modifyDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return nd;
	}

	public int updateById(News_Detail detail) {
		String sql = "update news_detail set title=?,content=?,author=?,summary=? where id=? ";
		Object[] params = { detail.getTitle(), detail.getContent(),
				detail.getAuthor(), detail.getSummary(), detail.getId() };

		return executeUpdate(sql, params);
	}

}
