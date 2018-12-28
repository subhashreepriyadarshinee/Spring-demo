package spring_jdbc.com.hexa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring_jdbc.com.hexa.service.DBOperationService;

public class ClientApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ctx=new FileSystemXmlApplicationContext("./src/main/java/spring_jdbc/com/hexa/cfgs/applicationContext.xml");
       DBOperationService service=(DBOperationService) ctx.getBean("daoService");
       service.insert(100,"Subha","STUOID WORK",00000);
	}
}
