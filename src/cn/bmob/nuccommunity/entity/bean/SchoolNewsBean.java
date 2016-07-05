package cn.bmob.nuccommunity.entity.bean;

import cn.bmob.nuccommunity.util.spider.SchoolNewsTool;

/**
 * 类:  <code> SchoolNewsBean </code><br>
 * 功能描述: 校园官网信息JavaBean<br>
 * 创建人: 卫卫羊习习<br>
 * 创建日期: 2016-5-27 下午5:23:41<br>
 * 开发环境: JDK6.0
 */
public class SchoolNewsBean {

	private String XNGG_title = null;//标题
	private String XNGG_href = null;//文章连接
	private String XNGG_time = null;//文章发表时间
	private String XNGG_content = null;//文章内容

	public String getXNGG_title() {
		return XNGG_title;
	}

	public void setXNGG_title(String xNGG_title) {
		XNGG_title = xNGG_title;
	}

	public String getXNGG_href() {
		return XNGG_href;
	}

	public void setXNGG_href(String xNGG_href) {
		XNGG_href = xNGG_href;
	}

	public String getXNGG_time() {
		return XNGG_time;
	}

	public void setXNGG_time(String xNGG_time) {
		XNGG_time = xNGG_time;
	}

	public String getxNGG_content() {
		XNGG_content = SchoolNewsTool.getSchoolNewsBeanContentByHref(XNGG_href);
		return XNGG_content;
	}

	public void setxNGG_content(String xNGG_content) {
		this.XNGG_content = xNGG_content;
	}

}
