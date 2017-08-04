package cn.bdqn.bean;

import java.util.Date;

public class News_Category {
	private Integer id;
	private String name;
	private Date createDate;

	/*
	 * FieldTypeComment idbigint(10) NOT NULL namevarchar(50) NULL
	 * createDatedatetime NULL
	 */
	public Integer getId() {
		return id;
	}

	public String toString() {
		return "News_Category [id=" + id + ", name=" + name + ", createDate="
				+ createDate + "]";
	}

	public News_Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News_Category(Integer id, String name, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
