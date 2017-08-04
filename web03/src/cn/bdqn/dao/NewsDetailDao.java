package cn.bdqn.dao;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDetailDao {
	/**
	 * ��ʾ����������Ϣ
	 * @return list����
	 */
	List<News_Detail> showAllNews();

	int deleteNews(int id);

	// ��ѯָ����Ϣ������
	News_Detail findById(Serializable id);

	int updateById(News_Detail detail);
}
