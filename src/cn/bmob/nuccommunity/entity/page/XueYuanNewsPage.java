package cn.bmob.nuccommunity.entity.page;

import java.util.ArrayList;
import java.util.List;
import cn.bmob.nuccommunity.entity.bean.XueYuanNewsBean;
/**
 * ��:  <code> XueYuanNewsPage </code><br>
 * ��������: ѧԺ��Ϣҳ��Bean<br>
 * ������: ������ϰϰ<br>
 * ��������: 2016-5-27 ����5:26:34<br>
 * ��������: JDK6.0
 */

public class XueYuanNewsPage {
	List<XueYuanNewsBean> XYXW_beanList = new ArrayList<XueYuanNewsBean>();//ѧԺ����
	List<XueYuanNewsBean> XSHD_beanList = new ArrayList<XueYuanNewsBean>();//ѧ���
	List<XueYuanNewsBean> TZGG_beanList = new ArrayList<XueYuanNewsBean>();//֪ͨ����
	List<XueYuanNewsBean> TOP_beanlist = new ArrayList<XueYuanNewsBean>();//ͷ��
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
