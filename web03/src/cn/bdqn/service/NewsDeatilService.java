package cn.bdqn.service;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDeatilService {
	/**
	 * 显示所有新闻信息的接口
	 */
	List<News_Detail> showAllNews();

	/**
	 * 根据id删除指定新闻的接口
	 */
	int delNews(int id);

	News_Detail findById(Serializable id);

	// 根据id修改指定新闻信息
	boolean updateById(News_Detail delail);
}
