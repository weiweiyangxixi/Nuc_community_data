package cn.bmob.nuccommunity.entity.page;

import java.util.ArrayList;
import java.util.List;
import cn.bmob.nuccommunity.entity.bean.XueYuanNewsBean;
/**
 * 类:  <code> XueYuanNewsPage </code><br>
 * 功能描述: 学院信息页面Bean<br>
 * 创建人: 卫卫羊习习<br>
 * 创建日期: 2016-5-27 下午5:26:34<br>
 * 开发环境: JDK6.0
 */

public class XueYuanNewsPage {
	List<XueYuanNewsBean> XYXW_beanList = new ArrayList<XueYuanNewsBean>();//学院新闻
	List<XueYuanNewsBean> XSHD_beanList = new ArrayList<XueYuanNewsBean>();//学生活动
	List<XueYuanNewsBean> TZGG_beanList = new ArrayList<XueYuanNewsBean>();//通知公告
	List<XueYuanNewsBean> TOP_beanlist = new ArrayList<XueYuanNewsBean>();//头条
	public List<XueYuanNewsBean> getXYXW_beanList() {
		return XYXW_beanList;
	}
	public void setXYXW_beanList(List<XueYuanNewsBean> xYXW_beanList) {
		XYXW_beanList = xYXW_beanList;
	}
	public List<XueYuanNewsBean> getXSHD_beanList() {
		return XSHD_beanList;
	}
	public void setXSHD_beanList(List<XueYuanNewsBean> xSHD_beanList) {
		XSHD_beanList = xSHD_beanList;
	}
	public List<XueYuanNewsBean> getTZGG_beanList() {
		return TZGG_beanList;
	}
	public void setTZGG_beanList(List<XueYuanNewsBean> tZGG_beanList) {
		TZGG_beanList = tZGG_beanList;
	}
	public List<XueYuanNewsBean> getTOP_beanlist() {
		return TOP_beanlist;
	}
	public void setTOP_beanlist(List<XueYuanNewsBean> tOP_beanlist) {
		TOP_beanlist = tOP_beanlist;
	}
	
}
