package cn.bmob.nuccommunity.util.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.bmob.nuccommunity.entity.bean.XueYuanNewsBean;
import cn.bmob.nuccommunity.entity.page.XueYuanNewsPage;

public class XueYuan_7_NewsTool extends XueYuanNewsTool {

	@Override
	public XueYuanNewsPage getXueYuanNewsPage() {
		XueYuanNewsPage xueYuanNewsPage = new XueYuanNewsPage();
		Document document;
		try {
			document = Jsoup.connect("http://csce.nuc.edu.cn/list.jsp?urltype=tree.TreeTempUrl&wbtreeid=1087").timeout(5000).ignoreHttpErrors(true)
					.header("User-Agent",
							"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
					.get();
			Elements elements1 = document.select("a[href]");
			for (Element element : elements1) {
				if (element.attr("abs:href").length() >= 32) {
					// 学院新闻
					if (element.attr("abs:href").substring(0, 32).equals("http://csce.nuc.edu.cn/info/1087")) {
						// System.out.println(element.text());
						XueYuanNewsBean xueYuanNewsBean = new XueYuanNewsBean();
						xueYuanNewsBean.setXY_title(element.text());
						xueYuanNewsBean.setXY_href(element.attr("abs:href"));
						xueYuanNewsPage.getXYXW_beanList().add(xueYuanNewsBean);
					}
				}
			}
			document = Jsoup.connect("http://csce.nuc.edu.cn/list.jsp?urltype=tree.TreeTempUrl&wbtreeid=1088").timeout(5000).ignoreHttpErrors(true)
					.header("User-Agent",
							"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
					.get();
			Elements elements2 = document.select("a[href]");
			for (Element element : elements2) {
				if (element.attr("abs:href").length() >= 32) {
					// 通知公告
					if (element.attr("abs:href").substring(0, 32).equals("http://csce.nuc.edu.cn/info/1088")) {
						// System.out.println(element.text());
						XueYuanNewsBean xueYuanNewsBean = new XueYuanNewsBean();
						xueYuanNewsBean.setXY_title(element.text());
						xueYuanNewsBean.setXY_href(element.attr("abs:href"));
						xueYuanNewsPage.getTZGG_beanList().add(xueYuanNewsBean);
					}
				}
			}
			document = Jsoup.connect("http://csce.nuc.edu.cn/xs/xsdt.htm").timeout(5000).ignoreHttpErrors(true)
					.header("User-Agent",
							"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
					.get();
			Elements elements3 = document.select("a[href]");
			for (Element element : elements3) {
				if (element.attr("abs:href").length() >= 32) {
					// 学生活动
					if (element.attr("abs:href").substring(0, 32).equals("http://csce.nuc.edu.cn/info/1027")) {
						// System.out.println(element.text());
						XueYuanNewsBean xueYuanNewsBean = new XueYuanNewsBean();
						xueYuanNewsBean.setXY_title(element.text());
						xueYuanNewsBean.setXY_href(element.attr("abs:href"));
						xueYuanNewsPage.getXSHD_beanList().add(xueYuanNewsBean);
					}
				}
			}

		} catch (Exception exception) {

		}
		return xueYuanNewsPage;
	}

}
