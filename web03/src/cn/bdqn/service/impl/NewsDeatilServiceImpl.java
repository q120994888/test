package cn.bdqn.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.dao.NewsDetailDao;
import cn.bdqn.dao.impl.NewsDeatilDaoImpl;
import cn.bdqn.service.NewsDeatilService;

public class NewsDeatilServiceImpl implements NewsDeatilService {

	private NewsDetailDao dao = new NewsDeatilDaoImpl();

	/**
	 * ��ʾ����������Ϣ
	 */
	public List<News_Detail> showAllNews() {
		NewsDetailDao md = new NewsDeatilDaoImpl();
		return md.showAllNews();
	}

	/**
	 * ����idɾ������
	*/
	public int delNews(int id) {
		NewsDetailDao md = new NewsDeatilDaoImpl();
		return md.deleteNews(id);
	}

	public News_Detail findById(Serializable id) {

		return dao.findById(id);
	}

	public boolean updateById(News_Detail delail) {
		if (dao.updateById(delail) > 0) {
			return true;

		}

		return false;
	}

}
