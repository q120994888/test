package cn.bdqn.service;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDeatilService {
	/**
	 * ��ʾ����������Ϣ�Ľӿ�
	 */
	List<News_Detail> showAllNews();

	/**
	 * ����idɾ��ָ�����ŵĽӿ�
	 */
	int delNews(int id);

	News_Detail findById(Serializable id);

	// ����id�޸�ָ��������Ϣ
	boolean updateById(News_Detail delail);
}
