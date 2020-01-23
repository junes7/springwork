package di.constructor03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		IWriteArticleMgr write = factory.getBean("write", IWriteArticleMgr.class);
/*		ArticleDTO dao = new ArticleDTO();
		write.write(dao);*/
		write.write(new ArticleDTO());
	}
}
