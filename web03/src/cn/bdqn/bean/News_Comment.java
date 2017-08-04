package cn.bdqn.bean;

import java.util.Date;

public class News_Comment {
	private Integer id;
	private Integer NewsId;
	private String content;
	private String author;
	private String ip;
	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNewsId() {
		return NewsId;
	}

	public void setNewsId(Integer newsId) {
		NewsId = newsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public News_Comment(Integer id, Integer newsId, String content,
			String author, String ip, Date createDate) {
		super();
		this.id = id;
		NewsId = newsId;
		this.content = content;
		this.author = author;
		this.ip = ip;
		this.createDate = createDate;
	}

	public News_Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "News_Comment [id=" + id + ", NewsId=" + NewsId + ", content="
				+ content + ", author=" + author + ", ip=" + ip
				+ ", createDate=" + createDate + "]";
	}

	/*
	 * idbigint(10) NOT NULLid newsIdbigint(10) NULL评论新闻id contentvarchar(2000)
	 * NULL评论内容 authorvarchar(50) NULL评论者 ipvarchar(20) NULL评论ip
	 * createDatedatetime NULL发表时间
	 */

}
