package cn.bmob.nuccommunity.entity.page;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.nuccommunity.entity.bean.SchoolNewsBean;
import cn.bmob.nuccommunity.util.spider.SchoolNewsTool;

/**
 * 类:  <code> SchoolNewsPage </code><br>
 * 功能描述: 校园官网信息页面<br>
 * 创建人: 卫卫羊习习<br>
 * 创建日期: 2016-5-27 下午5:24:16<br>
 * 开发环境: JDK6.0
 */
public class SchoolNewsPage {
	private SchoolNewsPage beforPage = null;//上一页
	private SchoolNewsPage nextPage = null;//下一页
	private String XNGG_befor = null;//上一页链接
	private String XNGG_next = null;//下一页链接
	private List<SchoolNewsBean> XNGG_beanList = new ArrayList<SchoolNewsBean>();//新闻队列
	public String getXNGG_befor() {
		return XNGG_befor;
	}
	public void setXNGG_befor(String xNGG_befor) {
		XNGG_befor = xNGG_befor;
	}
	public String getXNGG_next() {
		return XNGG_next;
	}
	public void setXNGG_next(String xNGG_next) {
		XNGG_next = xNGG_next;
	}
	public List<SchoolNewsBean> getXNGG_beanList() {
		return XNGG_beanList;
	}
	public void setXNGG_beanList(List<SchoolNewsBean> xNGG_beanList) {
		XNGG_beanList = xNGG_beanList;
	}
	public SchoolNewsPage getBeforPage() {
		if (this.XNGG_befor!=null) {
			beforPage = SchoolNewsTool.schoolNewsXNGG_GetHTMLByURL(XNGG_befor);
		}
		return beforPage;
	}
	public void setBeforPage(SchoolNewsPage beforPage) {
		this.beforPage = beforPage;
	}
	public SchoolNewsPage getNextPage() {
		if (this.XNGG_next!=null) {
			nextPage = SchoolNewsTool.schoolNewsXNGG_GetHTMLByURL(XNGG_next);
		}
		return nextPage;
	}
	public void setNextPage(SchoolNewsPage nextPage) {
		this.nextPage = nextPage;
	}
	
}
