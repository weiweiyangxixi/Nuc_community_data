package cn.bmob.nuccommunity.entity.bean;

import cn.bmob.nuccommunity.util.spider.SchoolNewsTool;

/**
 * ��:  <code> SchoolNewsBean </code><br>
 * ��������: У԰������ϢJavaBean<br>
 * ������: ������ϰϰ<br>
 * ��������: 2016-5-27 ����5:23:41<br>
 * ��������: JDK6.0
 */
public class SchoolNewsBean {

	private String XNGG_title = null;//����
	private String XNGG_href = null;//��������
	private String XNGG_time = null;//���·���ʱ��
	private String XNGG_content = null;//��������

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
