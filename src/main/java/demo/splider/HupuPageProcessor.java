package demo.splider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class HupuPageProcessor implements PageProcessor{

	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
	
	public void process(Page page) {
		
		
	}

	public Site getSite() {
		return site;
	}
	
	

}
