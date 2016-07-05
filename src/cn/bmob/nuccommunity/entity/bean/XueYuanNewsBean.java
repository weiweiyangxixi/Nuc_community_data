package cn.bmob.nuccommunity.entity.bean;

import cn.bmob.nuccommunity.util.spider.XueYuanNewsTool;
/**
 * 类:  <code> XueYuanNewsTool </code><br>
 * 功能描述: 学院信息Bean
 * 		  <br>
 * 创建人: 卫卫羊习习<br>
 * 创建日期: 2016-5-27 下午5:26:34<br>
 * 开发环境: JDK6.0
 */

public class XueYuanNewsBean {
	private String XY_title = null;//标题
	private String XY_href = null;//连接
	private String XY_time = null;//时间
	private String XY_content = null;//文章
	public String getXY_title() {
		return XY_title;
	}
	public void setXY_title(String xY_title) {
		this.XY_title = xY_title;
	}
	public String getXY_href() {
		return XY_href;
	}
	public void setXY_href(String xY_href) {
		this.XY_href = xY_href;
	}
	public String getXY_time() {
		return XY_time;
	}
	public void setXY_time(String xY_time) {
		this.XY_time = xY_time;
	}
	public String getXY_content(XueYuanNewsTool xueYuanNewsTool) {
		XY_content = xueYuanNewsTool.getXueYuanNewsBeanContentByHref(this.XY_href);
		return XY_content;
	}
	public void setXY_content(String xY_content) {
		this.XY_content = xY_content;
	}
	
}
