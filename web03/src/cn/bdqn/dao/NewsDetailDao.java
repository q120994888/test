package cn.bdqn.dao;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDetailDao {
	/**
	 * 显示所有新闻信息
	 * @return list集合
	 */
	List<News_Detail> showAllNews();

	int deleteNews(int id);

	// 查询指定信息的新闻
	News_Detail findById(Serializable id);

	int updateById(News_Detail detail);
}
