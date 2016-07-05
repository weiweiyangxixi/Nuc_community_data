package cn.bmob.nuccommunity.util.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cn.bmob.nuccommunity.entity.page.XueYuanNewsPage;

/**
 * ��:  <code> SchoolNewsTool </code><br>
 * ��������: ѧԺ��Ϣ���߸���
 * 		  ����ʵ�ָ�ѧԺgetXueYuanNewsBeanContentByHref------>��̬ <br>
 * ������: ������ϰϰ<br>
 * ��������: 2016-5-27 ����5:26:34<br>
 * ��������: JDK6.0
 */

public abstract class XueYuanNewsTool {

	public abstract XueYuanNewsPage getXueYuanNewsPage();
	public String getXueYuanNewsBeanContentByHref(String xy_href) {
		// TODO Auto-generated method stub
		Document document;
		String content = null;
		try {
			document = Jsoup
					.connect(xy_href)
					.timeout(5000)
					.ignoreHttpErrors(true)
					.header("User-Agent",
							"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
					.get();
			content = document.body().text();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
}
